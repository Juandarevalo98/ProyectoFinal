package com.example.proyectofinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
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

        buttonHome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}
