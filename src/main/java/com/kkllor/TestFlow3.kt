package com.kkllor

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * @author kkllor
 * @date 2022/6/18 3:36 PM
 */
class TestFlow3 {

}

fun main(args: Array<String>) = runBlocking {
    launch {
        (1..100).asFlow().collect {
            delay(10)
            println(it)
        }
    }
    launch {
        flowOf(1, 2, 3, 4, 5).collect {
            delay(20)
            println(it)
        }
    }
    Unit
}
