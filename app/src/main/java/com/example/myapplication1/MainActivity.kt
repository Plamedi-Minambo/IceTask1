package com.example.myapplication1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnOne : Button
    private lateinit var stValOne : EditText
    private lateinit var stValTwo : EditText
    private lateinit var tvResult : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnOne = findViewById(R.id.button2)
        stValOne = findViewById(R.id.etValOne)
        stValTwo = findViewById(R.id.etValTwo)
        tvResult = findViewById(R.id.textview)

        btnOne.setOnClickListener(){
            val num1 = stValOne.text.toString().toInt()
            val num2 = stValTwo.text.toString().toInt()
            val answer = num1 + num2
            tvResult.text = "" + num1 + "+" + num2 +"=" + answer
        }

    }
}

