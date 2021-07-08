package com.upemor.ep2_minauro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.room.Room
import com.upemor.ep2_minauro.persistence.DatabaseUsuario
import com.upemor.ep2_minauro.persistence.entity.Usuario

class
MainActivity : AppCompatActivity() {
    private lateinit var db:DatabaseUsuario
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nomus = findViewById(R.id.username) as EditText
        var contra = findViewById(R.id.password) as EditText
        var btn = findViewById(R.id.btnLogin) as Button

        db = Room.databaseBuilder(
            this,
            DatabaseUsuario::class.java,
            "DatabaseUsuario").build()

        /*val usuario = Usuario(
            1,
            "admin",
            "admin",
            "admin"
        )*/

        btn.setOnClickListener{
            val nombreUsuario = nomus.text;
            val contraseña = contra.text
            var prueba = db.UsuarioDAO().getUser("admin", "admin")
            print(prueba)

        }
    }
}