package com.example.stellaandfirst

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d("mytag", "Second Activity created")

        var resultTextView = findViewById<TextView>(R.id.textViewResult)

        resultTextView.setOnClickListener {
            var i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
 /*

        var resultData = intent.extras?.getString("keyun")

        resultTextView.setText(resultData)*/
    }

    override fun onStart() {
        super.onStart()
        Log.d("mytag", "Second Activity started")
    }

    override fun onResume() {
        super.onResume()
        Log.d("mytag", "Second Activity resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.d("mytag", "Second Activity paused")
    }

    override fun onStop() {
        super.onStop()
        Log.d("mytag", "Second Activity stopped")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("mytag", "Second Activity destroyed")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d("mytag", "Second Activity restarted")
    }
}