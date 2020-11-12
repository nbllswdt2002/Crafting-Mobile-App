package com.example.listviewcraft.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserProfileDao {

    @Query(value = "SELECT * FROM user ORDER BY id desc")
    fun getUserData():List<UserEntity>?

    @Insert
    fun insertUser(user: UserEntity): Long
}