package com.example.dbsbroadcastreceiver

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        var myIntentFilter = IntentFilter("android.intent.action.AIRPLANE_MODE")
        var myReceiver = MyReceiver()
        registerReceiver(myReceiver, myIntentFilter)

        var mytext = findViewById<TextView>(R.id.myTextview)
        var myIntent = Intent("ansari_intent")
        mytext.setOnClickListener {
            myIntent.putExtra("key", "Hi dude how r u?")
            myIntent.setAction("ansari_action")
            sendBroadcast(myIntent)
        }

    }
}