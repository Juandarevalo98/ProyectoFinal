package com.example.proyectofinal

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupMenu
import android.widget.Toast
import androidx.activity.ComponentActivity

class TaskActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task)

        val buttonHome: ImageButton = findViewById(R.id.button_home)
        val buttonUser: ImageButton = findViewById(R.id.button_user)
        val addTaskButton = findViewById<Button>(R.id.button_add_task)
        val editTaskButton = findViewById<Button>(R.id.button_edit_task)
        val acomplishedButton = findViewById<Button>(R.id.button_task_acomplished)
        val deletedTaskButton = findViewById<Button>(R.id.button_deleted_task)

        buttonHome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        buttonUser.setOnClickListener {
            showUserMenu(buttonUser)
        }

        addTaskButton.setOnClickListener {
            val intent = Intent(this, AddActivity::class.java)
            startActivity(intent)
        }

        editTaskButton.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }

        acomplishedButton.setOnClickListener {
            val intent = Intent(this, AcomplishedActivity::class.java)
            startActivity(intent)
        }

        deletedTaskButton.setOnClickListener {
            val intent = Intent(this, DeleteActivity::class.java)
            startActivity(intent)
        }
    }

    private fun showUserMenu(anchor: ImageButton) {
        val popupMenu = PopupMenu(this, anchor)
        popupMenu.menuInflater.inflate(R.menu.user_menu, popupMenu.menu)

        popupMenu.setOnMenuItemClickListener { item: MenuItem ->
            when (item.itemId) {
                R.id.item_cerrar_sesion -> {
                    Toast.makeText(this, "Cerrando sesión...", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                else -> false
            }
        }
        popupMenu.show()
    }
}