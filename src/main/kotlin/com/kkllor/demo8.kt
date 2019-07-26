package com.kkllor

fun lambda() {
    var list = listOf(1, 2, 3, 4, 5, 6, 7)
    val lambdaList = list.map {
        it * 2
        return
    }
    println(lambdaList)
}

fun function() {
    var list = listOf(1, 2, 3, 4, 5, 6, 7)
    val functionList = list.map(fun(it: Int): Int {
        return it * 2
    })
    println(functionList)
}

val intFunc:Int.(Int)->Int = {other->plus(other)}

fun main(args: Array<String>) {
    lambda()
    function()
    5.intFunc(3)
}