package com.kkllor

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.transform
import kotlinx.coroutines.runBlocking

/**
 * @author kkllor
 * @date 2022/6/18 3:44 PM
 */
class TestFlow2 {
}
fun main(args:Array<String>) = runBlocking {
    (1..10).asFlow().map { convert(it) }.collect {
        println(it)
    }

    (1..10).asFlow().transform {
        emit("before handle $it")
        emit(convert(it))
    }.collect {
        println(it)
    }
    Unit
}

suspend fun convert(i:Int):String{
    delay(100)
    return "$i apple"
}