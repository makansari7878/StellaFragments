package com.example.dbsbroadcastreceiver

import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        var myIntentFilter = IntentFilter("android.provider.Telephony.SMS_RECEIVED")
        var myReceiver = MyReceiver()
        registerReceiver(myReceiver, myIntentFilter)

        if(ActivityCompat.checkSelfPermission(this, android.Manifest.permission.RECEIVE_SMS) ==
                PackageManager.PERMISSION_GRANTED){
            Toast.makeText(this, "PERMISSION GRANTED", Toast.LENGTH_LONG).show()
        }
        else {
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.RECEIVE_SMS), 1234)
        }

        /*var mytext = findViewById<TextView>(R.id.myTextview)
        var myIntent = Intent("ansari_intent")
        mytext.setOnClickListener {
            myIntent.putExtra("key", "Hi dude how r u?")
            myIntent.setAction("ansari_action")
            sendBroadcast(myIntent)
        }*/

    }
}