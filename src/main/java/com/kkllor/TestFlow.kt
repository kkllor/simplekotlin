package com.kkllor

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * @author kkllor
 * @date 2022/6/17 6:35 PM
 */
class TestFlow {
}
fun main(args:Array<String>) = runBlocking {

    launch {
        repeat(100){
            delay(100)
            println("mainThread is not blocked")
        }
    }
    simpleFlow().collect {
        println(it)
    }
    Unit
}

fun simpleFlow() = flow<Int> {
    repeat(100){
        delay(100)
        emit(it)
    }
}