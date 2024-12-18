package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView



class health : AppCompatActivity() {

    private lateinit var stepsTextView: TextView
    private lateinit var heartRateTextView: TextView
    private lateinit var activityLevelTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_health)




        // Запрос данных о шагах и сердечном ритме

    }


}