package com.example.bajajnavfrag

import android.util.Log
import javax.inject.Inject

class Car {
    @Inject
    constructor()
    fun getCar(){
        Log.i("mytag","car is running")
    }
}