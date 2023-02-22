package com.example.stellaservices

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import android.widget.Toast
import kotlin.concurrent.thread

class SplashActviity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_actviity)
        var splshText = findViewById<TextView>(R.id.textViewSplash)
        var handler = Handler()


        thread {
            //Toast.makeText(this, "my toast", Toast.LENGTH_LONG).show()
            for( i in 1..5){
                Thread.sleep(1000)
                handler.post {
                    Toast.makeText(this, "my toast", Toast.LENGTH_SHORT).show()
                    splshText.setText("${i}")
                }
            }
            var i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
    }
}