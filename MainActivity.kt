package com.example.flashcardappcurrent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flashcardQuestion = findViewById<TextView>(R.id.flashcard_question)
        val flashcardAnwser = findViewById<TextView>(R.id.flashcard_anwser)
        flashcardQuestion.setOnClickListener{
            flashcardQuestion.visibility = View.INVISIBLE
            flashcardAnwser.visibility = View.VISIBLE

        }
    }
}