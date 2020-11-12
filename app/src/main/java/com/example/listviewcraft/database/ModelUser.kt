package com.example.listviewcraft.database

import java.util.*

data class ModelUser (
        var id: String,
        var name: String,
        var place: String,
        var date_of_birth: Date,
        var address: String,
        var id_card_number: Number,
        var email: String,
        var username: String,
        var password: String,
        var confirm_password: String,
        var phone: Number
)