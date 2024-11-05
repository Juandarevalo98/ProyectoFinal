package com.example.proyectofinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.ComponentActivity

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)

        val gestionTareasButton = findViewById<Button>(R.id.button_gestion_tareas)
        val ConfiguracionButton = findViewById<Button>(R.id.button_configuracion)
        val NoticicacionButton = findViewById<Button>(R.id.button_configuracion)

        gestionTareasButton.setOnClickListener {
            val intent = Intent(this, TaskActivity::class.java)
            startActivity(intent)
        }
    }
}

