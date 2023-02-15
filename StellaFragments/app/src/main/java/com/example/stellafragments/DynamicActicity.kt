package com.example.stellafragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DynamicActicity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_acticity)

        supportFragmentManager.beginTransaction()
            .add(R.id.myconstrlayout, RedFragment()).addToBackStack(null).commit()
    }
}