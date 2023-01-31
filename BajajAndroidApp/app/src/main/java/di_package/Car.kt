package di_package

import android.util.Log

class Car(var engine : Engine, var wheels: Wheels) {
  var TAG = "mytag"
    fun getCar(){
        engine.getEngine()
        wheels.getWheels()
        Log.d(TAG, "getCar: ")
    }
}

class Engine(){
    fun getEngine(){
        Log.d("mytag", "getEngine: ")
    }
}

class Wheels(){
    fun getWheels(){
        Log.d("mytag", "getWhees: ")
    }
}