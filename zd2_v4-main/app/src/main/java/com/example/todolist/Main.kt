package com.example.todolist

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun list(view: View) {
        text += intent.getStringExtra("ITEM_TEXT")  + "\n"
        val intent = Intent(this, List::class.java)
        intent.putExtra("ITEM_TEXT", text)
        startActivity(intent)


    }
    fun images(view: View) {

        val intent = Intent(this, Images::class.java)
        startActivity(intent)


    }
    fun login(view: View) {

        val intent = Intent(this, Login::class.java)
        startActivity(intent)
    }

    companion object{
        var text=""
    }

    fun hea(view: View) {
        val intent = Intent(this, health::class.java)
        startActivity(intent)
    }


}