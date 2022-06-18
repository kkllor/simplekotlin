package com.kkllor

import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.runBlocking

/**
 * @author kkllor
 * @date 2022/6/18 3:51 PM
 */
class TestFlowTake {
    fun simpleFlow() = flow {
        try {
            emit(1)
            emit(2)
            println("simpleFlow 1")
            emit(3)
        } finally {
            println("simpleFlow finally")
        }
    }
}

fun main(args: Array<String>) = runBlocking {
    TestFlowTake().simpleFlow().take(1).collect {
        println(it)
    }
}

