package com.example.proyectofinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Establecer el contenido de la pantalla de Login (el layout de activity_login.xml)
        setContentView(R.layout.activity_login)

        // Referencias a los elementos de la interfaz de usuario
        val usernameEditText = findViewById<EditText>(R.id.editTextUsername)
        val passwordEditText = findViewById<EditText>(R.id.editTextPassword)
        val loginButton = findViewById<Button>(R.id.buttonLogin)

        // Configurar el clic en el botón "Iniciar sesión"
        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Validación de usuario y contraseña
            if (username == "UsuarioPrueba" && password == "12345") {
                // Si las credenciales son correctas, ir a HomeActivity
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()  // Opcional: cierra MainActivity para que no se pueda regresar
            } else {
                // Aquí puedes manejar un error si las credenciales son incorrectas
                // Puedes mostrar un Toast o Snackbar
                usernameEditText.error = "Credenciales incorrectas"
                passwordEditText.error = "Credenciales incorrectas"
            }
        }
    }
}
