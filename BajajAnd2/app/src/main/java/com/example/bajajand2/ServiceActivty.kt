package com.example.bajajand2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ServiceActivty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service_activty)
        var buttonStart = findViewById<Button>(R.id.buttonStart)
        var buttonStop = findViewById<Button>(R.id.buttonStop)

        buttonStart.setOnClickListener {
                var i = Intent(this, MyService::class.java)
            startService(i)
        }

        buttonStop.setOnClickListener {
            var i = Intent(this, MyService::class.java)
            stopService(i)
        }
    }
}