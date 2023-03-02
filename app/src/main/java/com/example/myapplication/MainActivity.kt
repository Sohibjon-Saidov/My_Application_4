package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val personNameEditText = findViewById<EditText>(R.id.editText2)
        val passwordEditText = findViewById<EditText>(R.id.editText3)
        val submitButton = findViewById<Button>(R.id.button4)
        val resultText = findViewById<TextView>(R.id.textView5)

        submitButton.setOnClickListener {
            val result = personNameEditText.text.toString() + passwordEditText.text.toString()
            resultText.text = result
            println("button clicked!")
        }
    }
}

