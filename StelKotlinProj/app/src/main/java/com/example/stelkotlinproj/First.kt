package com.example.stelkotlinproj

class Tiger(){
    lateinit var name : String
    var legs : Int = 4

    fun tigerSounds(){
        name = "TIGER"
        println("tiger roars" + name)
    }

   inner class subClass{
        var ears = 2
        fun subclassmethod(){
            println("subclass" + legs)
        }
    }
}

fun main(){

    var tiger = Tiger()
    println(tiger.legs)
    tiger.tigerSounds()

    var innercls = Tiger().subClass()
    println(innercls.ears)
    innercls.subclassmethod()

}

