package com.example.proyectofinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import android.app.DatePickerDialog
import android.widget.ImageButton
import java.util.*

class AddActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_add)

        val buttonHome: ImageButton = findViewById(R.id.button_home)
        val buttonUser: ImageButton = findViewById(R.id.button_user)
        val fechaVencimientoText: TextView = findViewById(R.id.fechaVencimientoText)
        val btnGuardar: Button = findViewById(R.id.button_guardar)
        val btnCancelar: Button = findViewById(R.id.button_cancelar)

        fechaVencimientoText.setOnClickListener {
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)

            val datePickerDialog = DatePickerDialog(this, { _, selectedYear, selectedMonth, selectedDay ->
                val fecha = "$selectedDay/${selectedMonth + 1}/$selectedYear"
                fechaVencimientoText.text = fecha
            }, year, month, day)
            datePickerDialog.show()
        }

        buttonHome.setOnClickListener {
            setContentView(R.layout.activity_home)
        }

        btnCancelar.setOnClickListener {
            finish()
        }
    }
}