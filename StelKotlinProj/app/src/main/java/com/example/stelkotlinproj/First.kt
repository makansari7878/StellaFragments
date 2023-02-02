package com.example.stelkotlinproj

import kotlinx.coroutines.*
import kotlin.concurrent.thread

class Animal(){

    var age = 10
    var legs = 4

    fun playing(){
        println("Animal is playing")
    }

    fun eating(){
        println("Animal is eating")
    }
}


fun main() {

    var animal : Animal?= Animal()

    /*Animal().apply {
        println(this.age)
        println(legs)
        eating()
        playing()
    }*/

    /*var res = with(animal){
        this.eating()
        playing()
        var newage = age + 10
        newage
    }*/

//    println("new age is $res")
/*
    animal?.let {
        println("animal is ready")
        println(it.age)
        it.eating()
    }

    var res = animal?.run {
        println("animal is ready")
        println(this.age)
        eating()
        "result"
    }
    println(res)

    println("continue of the program")*/

/*    var arr : MutableList<Int> = mutableListOf(45,65,45,11,22)
    arr.add(100)
    println(arr)

    arr.remove(11)
    println(arr)*/

    var arr : MutableList<Int> = mutableListOf(45,65,45,11,22)
    arr.also {
        it.add(100)
        it.remove(11)
        println(it)
    }

}
