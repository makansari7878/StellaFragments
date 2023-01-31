package com.example.bajajand2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView

class SpalshAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spalsh)
        var texviewRes = findViewById<TextView>(R.id.textViewSplash)

        var handler = Handler()
        Thread{

            for(i in 1..5){
                Thread.sleep(1000)
                handler.post {
                    texviewRes.setText("${i}")
                }

            }

            var i = Intent(this, MainActivity::class.java)
            startActivity(i)

        }.start()
    }
}