package com.kkllor

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.reduce
import kotlinx.coroutines.runBlocking

/**
 * @author kkllor
 * @date 2022/6/18 3:56 PM
 */
class TestFlowTerminal {
}

fun main(args:Array<String>) = runBlocking {
   val result = (1..10).asFlow().map { it*2 }.reduce { accumulator, value -> accumulator+value }
    println(result)
    Unit
}