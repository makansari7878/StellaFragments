package com.example.stelkotlinproj

import kotlinx.coroutines.*
import kotlin.concurrent.thread



fun main() = runBlocking{

   println("main fun started on ${Thread.currentThread().name}")

  var job : Job = GlobalScope.launch {
      println("Coroutine started on ${Thread.currentThread().name}")
      for (i in 1..10){
          println(i)
          setDelay(1000)
      }

      println("Coroutine ended on ${Thread.currentThread().name}")
  }
    delay(5000)

    job.cancelAndJoin()

    println("main fun ended on ${Thread.currentThread().name}")
}

suspend fun setDelay(time : Long){
    delay(time)
}
