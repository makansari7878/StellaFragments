package com.example.bajajbr

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyRecevier : BroadcastReceiver() {
    override fun onReceive(ctx: Context?, intent: Intent?) {

        Toast.makeText(ctx, "AIRPLANE MODE", Toast.LENGTH_LONG).show()

    }
}