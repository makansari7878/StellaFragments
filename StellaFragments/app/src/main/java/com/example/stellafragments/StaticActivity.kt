package com.example.stellafragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class StaticActivity : AppCompatActivity(),DataInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_static)
    }

    override fun saveData(data: String) {
       var blueFrag = supportFragmentManager
           .findFragmentById(R.id.fragmentContainerViewBlueFrag) as BlueFragment

        blueFrag.myMethod(data)
    }
}