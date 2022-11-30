package com.example.dbsbroadcastreceiver

import android.content.Intent
import android.content.IntentFilter
import android.content.SharedPreferences
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {

    lateinit var sp : SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mytext = findViewById<TextView>(R.id.myTextview)

//        var anim = AnimationUtils.loadAnimation(this, R.anim.blink)
//        mytext.startAnimation(anim)

        mytext.setOnClickListener {
            var i = Intent(this, SecondAcrivity::class.java)

            startActivity(i)

            overridePendingTransition(R.anim.blink,
                R.anim.blink);
        }



        var usernameEditText = findViewById<EditText>(R.id.editTextUserName)
        var submitButton = findViewById<Button>(R.id.buttonSubmit)
        Log.i("mytag", "activity created")
        
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



        sp = getSharedPreferences("myfile", MODE_PRIVATE)

      usernameEditText.setText(sp.getString("keyun",""))


        submitButton.setOnClickListener {
            var username = usernameEditText.text.toString()
            var editor = sp.edit()
            editor.putString("keyun", username)
            editor.commit()
        }




    }

/*    override fun onStart() {
        super.onStart()
        Log.i("mytag", "activity start")

    }

    override fun onResume() {
        super.onResume()
        Log.i("mytag", "activity resume")

    }

    override fun onPause() {
        super.onPause()

        Log.i("mytag", "activity pause")

    }

    override fun onStop() {
        super.onStop()

        Log.i("mytag", "activity stop")

    }*/
}