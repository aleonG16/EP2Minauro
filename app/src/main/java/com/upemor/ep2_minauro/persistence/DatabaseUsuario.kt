package com.upemor.ep2_minauro.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import com.upemor.ep2_minauro.persistence.dao.UsuarioDAO
import com.upemor.ep2_minauro.persistence.entity.Usuario

@Database(
    entities = [Usuario::class],
    version=0
)
abstract class DatabaseUsuario: RoomDatabase() {
    abstract fun UsuarioDAO(): UsuarioDAO

}