package com.example.proyectofinal

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.ComponentActivity
import java.util.Calendar

class RegisterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val fechaNacimientoText: TextView = findViewById(R.id.fechaNacimientoText)
        val cancelButton = findViewById<Button>(R.id.buttonCancel)
        val registerButton = findViewById<Button>(R.id.buttonRegister)

        fechaNacimientoText.setOnClickListener {
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)

            val datePickerDialog = DatePickerDialog(this, { _, selectedYear, selectedMonth, selectedDay ->
                val fecha = "$selectedDay/${selectedMonth + 1}/$selectedYear"
                fechaNacimientoText.text = fecha
            }, year, month, day)
            datePickerDialog.show()
        }

        cancelButton.setOnClickListener {
            finish()
        }
    }
}
