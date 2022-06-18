package com.kkllor

import kotlinx.coroutines.delay

/**
 * @author kkllor
 * @date 2022/6/17 3:15 PM
 */
class TestSequence {
}

fun main(args:Array<String>){
   val sequence = sequence {
        repeat(100){
            yield(it)
        }
    }
    Thread.sleep(5000)
    sequence.forEach { println(it) }
}