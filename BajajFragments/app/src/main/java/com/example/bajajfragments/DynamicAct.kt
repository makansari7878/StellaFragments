package com.example.bajajfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DynamicAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic)

        supportFragmentManager.beginTransaction().add(R.id.myconstrainlayout, RedFragment())
            .addToBackStack(null).commit()
    }
}