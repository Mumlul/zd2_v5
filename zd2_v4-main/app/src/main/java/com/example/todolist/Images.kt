package com.example.todolist

import android.annotation.SuppressLint
import android.app.ListActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class Images : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var itemContainer: LinearLayout
    private var text = ""

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_images)

        editText = findViewById(R.id.editText)
        val btnAdd: Button = findViewById(R.id.btnAdd)
        val Kizaru = findViewById<LinearLayout>(R.id.Kizaru)
        val Sobol = findViewById<LinearLayout>(R.id.Sobol)
        val Dru = findViewById<LinearLayout>(R.id.Dru)
        Kizaru.setOnClickListener {
            text += "Дежавю" + "\n"
            // Переход на существующий экран с передачей текста
            val intent = Intent(this, Main::class.java)
            intent.putExtra("ITEM_TEXT", text)
            startActivity(intent)
        }
        Sobol.setOnClickListener {
            text += "Путь к успеху" + "\n"
            // Переход на существующий экран с передачей текста
            val intent = Intent(this, Main::class.java)
            intent.putExtra("ITEM_TEXT", text)
            startActivity(intent)
        }
        Dru.setOnClickListener {
            text += "Рептилойды" + "\n"
            // Переход на существующий экран с передачей текста
            val intent = Intent(this, Main::class.java)
            intent.putExtra("ITEM_TEXT", text)
            startActivity(intent)
        }
        btnAdd.setOnClickListener {
            text += editText.text.toString()  + "\n"
            if (text.isNotEmpty()) {
            // Переход на существующий экран с передачей текста
                val intent = Intent(this, Main::class.java)
            intent.putExtra("ITEM_TEXT", text)
            startActivity(intent)
        }}

        /*btnAdd.setOnClickListener {
            text += editText.text.toString()  + "\n"
            if (text.isNotEmpty()) {
                val intent = Intent(this, Main::class.java)
                intent.putExtra("ITEM_TEXT", text)
                startActivity(intent)
            }


        }*/
    }


}