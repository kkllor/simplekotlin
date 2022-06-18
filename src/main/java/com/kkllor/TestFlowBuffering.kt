package com.kkllor

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

/**
 * @author kkllor
 * @date 2022/6/18 4:23 PM
 */
fun simple(): Flow<Int> = flow {
    repeat(10) {
        delay(100)
        emit(it)
    }
}

fun main() = runBlocking<Unit> {
    val time = measureTimeMillis {
        simple()
                .buffer()
                .collect { value ->
                    delay(200)
                    println(value)
                }
    }
    println("Collected in $time ms")
}

