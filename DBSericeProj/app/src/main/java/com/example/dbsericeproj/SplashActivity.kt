package com.example.dbsericeproj

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import android.widget.Toast
import kotlin.concurrent.thread

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var myIntentFilter = IntentFilter("ansari_action")
        var myReceiver = AnsariReceiver()
        registerReceiver(myReceiver, myIntentFilter)

        var myHandler = Handler()

        var countTextView = findViewById<TextView>(R.id.textViewCount)
        Toast.makeText(this, "thread is created", Toast.LENGTH_SHORT).show()

        thread {
            for (i in 1..5){
                myHandler.post {
                    countTextView.setText(" $i")
                }
                Thread.sleep(1000)
            }
            var i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
    }
}