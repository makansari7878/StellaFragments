package com.example.bajajbr

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyRecevier : BroadcastReceiver() {
    override fun onReceive(ctx: Context?, intent: Intent?) {

        Toast.makeText(ctx, "RECEIVED SMS", Toast.LENGTH_LONG).show()

    }
}