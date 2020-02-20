package com.example.addsubdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addButton.setOnClickListener {
            Res.text = "Result: " + (number1.text.toString().toInt() + number2.text.toString().toInt()).toString()
        }

        subButton.setOnClickListener {
            Res.text = "Result: " + (number1.text.toString().toInt() - number2.text.toString().toInt()).toString()
        }
    }
}
