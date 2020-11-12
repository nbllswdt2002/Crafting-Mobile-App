package com.example.listviewcraft.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [UserEntity::class], version = 1)
abstract class RoomAppDB : RoomDatabase() {
    companion object{
        private var INSTANCE: RoomAppDB? = null

        fun getAppDatabase(context: Context): RoomAppDB? {
            if(INSTANCE == null){
                INSTANCE = Room.databaseBuilder<RoomAppDB>(
                    context.applicationContext, RoomAppDB::class.java, "ListViewCraft"
                ).allowMainThreadQueries()
                        .build()
            }
            return INSTANCE
        }
    }
}