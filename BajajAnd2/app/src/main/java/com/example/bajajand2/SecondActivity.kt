package com.example.bajajand2

import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.i("mytag","second activity created")
        var textViewResult = findViewById<TextView>(R.id.textViewResult)
         var notificationManager: NotificationManager
        notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        textViewResult.setOnClickListener {
            notificationManager.cancel(1234)
          /*  var i = Intent(this, MainActivity::class.java)
            startActivity(i)*/
        }

        /*
          val myintent: Intent = getIntent()
          //var res = intent.extras?.getString("un")
         var res : User? = myintent.getParcelableExtra<User>("obj")
          textViewResult.setText("${res?.uname.toString()} and ${res?.pwd.toString()}")
  */

    }

/*

    override fun onStart() {
        super.onStart()
        Log.i("mytag","second activity start")
    }

    override fun onResume() {
        super.onResume()
        Log.i("mytag","second activity resume")
    }


    override fun onPause() {
        super.onPause()
        Log.i("mytag","second activity pause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("mytag","second activity stopped")
    }

    override fun onRestart() {
        super.onRestart()

        Log.i("mytag","second activity restart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("mytag","second activity destoyed")
    }
*/

}