package com.example.proyectofinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.ComponentActivity

class DeleteActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delete)

        val buttonHome: ImageButton = findViewById(R.id.button_home)
        val buttonUser: ImageButton = findViewById(R.id.button_user)
        val btnCancelar: Button = findViewById(R.id.button_cancelar)

        buttonHome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        btnCancelar.setOnClickListener {
            finish()
        }
    }
}