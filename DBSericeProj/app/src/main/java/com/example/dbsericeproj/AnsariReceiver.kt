package com.example.dbsericeproj

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AnsariReceiver : BroadcastReceiver() {
    override fun onReceive(ctx: Context?, intent: Intent?) {
        var data = intent?.getStringExtra("key")
        Toast.makeText(ctx, "message : $data", Toast.LENGTH_LONG).show()

        var myIntent = Intent(ctx, MainActivity::class.java)
        myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        ctx?.startActivity(myIntent)
    }
}