package com.upemor.ep2_minauro.persistence.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Usuario(
    @PrimaryKey(autoGenerate = true)
    val idUsuario:Long,
    val nomUsuario:String,
    val nickname:String,
    val pass:String
)

