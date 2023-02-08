package com.example.stellaandfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var resultTextView = findViewById<TextView>(R.id.textViewResult)

        var resultData = intent.extras?.getString("keyun")

        resultTextView.setText(resultData)
    }
}