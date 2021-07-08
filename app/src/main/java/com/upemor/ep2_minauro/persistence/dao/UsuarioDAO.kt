package com.upemor.ep2_minauro.persistence.dao

import androidx.room.*
import com.upemor.ep2_minauro.persistence.entity.Usuario

@Dao
interface UsuarioDAO {

    @Query("SELECT * FROM Usuario")
    fun getAll():List<Usuario>

    @Query("SELECT * FROM Usuario WHERE nickname = :nickname and pass = :pass")
    fun getUser(nickname:String,pass:String):Usuario

    @Insert
    suspend fun insert(Usuario:Usuario)


}