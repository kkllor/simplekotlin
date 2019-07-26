package com.kkllor

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main(args: Array<String>) {

    GlobalScope.launch {
        delay(1000L)
        println("world")
    }

    println("hello,")
    Thread.sleep(2000L)
}