package com.example.roomdb_yanuar_21.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note (
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    val title: String,
    val note: String
    )