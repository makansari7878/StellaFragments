package com.example.dbsbroadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(ctx: Context?, p1: Intent?) {
       Toast.makeText(ctx, "AIRPLAN MODE ", Toast.LENGTH_LONG).show()

        var i = Intent(ctx, SecondAcrivity::class.java)
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        ctx?.startActivity(i)
    }
}