package com.example.stelkotlinproj

import kotlinx.coroutines.*
import kotlin.concurrent.thread

class Circle(){

    fun area(){
        println("area of circle")
    }

    companion object{
        var college = "ABC"
        fun payFees(){
            println("student has to pay fees")
        }
    }
}



fun main(){

    println(Circle.college)
    Circle.payFees()


}
