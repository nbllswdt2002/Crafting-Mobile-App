package com.example.listviewcraft.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "user")
data class UserEntity(@PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val id: Int,
                      @ColumnInfo(name = "name") val name: String,
                      @ColumnInfo(name = "place") val place: String,
                      @ColumnInfo(name = "date_of_birth") val date_of_birth: Date,
                      @ColumnInfo(name = "address") val address: String,
                      @ColumnInfo(name = "id_card_number") val id_card_number: Number,
                      @ColumnInfo(name = "email") val email: String,
                      @ColumnInfo(name = "username") val username: String,
                      @ColumnInfo(name = "password") val password: String,
                      @ColumnInfo(name = "confirm_password") val confirm_password: String,
                      @ColumnInfo(name = "phone") val phone: Number)
{
}