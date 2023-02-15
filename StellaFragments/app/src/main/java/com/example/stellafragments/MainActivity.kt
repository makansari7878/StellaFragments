package com.example.stellafragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var redButton = findViewById<Button>(R.id.buttonRed)
        var blueButton = findViewById<Button>(R.id.buttonBlue)

        redButton.setOnClickListener {
            var redFragment = RedFragment()
            var myFragManager = supportFragmentManager
            var myTransaction = myFragManager.beginTransaction()
            myTransaction.replace(R.id.fragmentContainerView, redFragment)
            myTransaction.commit()

        }

        blueButton.setOnClickListener {

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, BlueFragment()).commit()
        }
    }
}