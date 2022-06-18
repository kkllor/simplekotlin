package com.kkllor

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull

/**
 * @author kkllor
 * @date 2022/6/18 3:32 PM
 */
class TestFlow1 {
    fun simpleFlow() = flow {
        repeat(100) {
            delay(100)
            emit(it)
        }
    }
}

fun main(args: Array<String>) {
    runBlocking {
        withTimeoutOrNull(5000) {
            TestFlow1().simpleFlow().collect {
                println(it)
            }
        }
        println("done")
    }
}

