package com.kkllor


fun main(args: Array<String>) {
    val sum: Int.(Int) -> Int = { plus(it) }
    println(2.sum(2))
    test()
}

val test = {
    println("asd")
}

fun alphabetWith(): String {
    val result = StringBuilder()
    return with(result) {
        for (letter in 'A'..'Z') {
            append(letter)
        }
        toString()
    }
}

fun alphabetWithF() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    toString()
}

var alphabetApply = StringBuffer().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
}.toString()

//fun sum(): Int.(Int) -> Int = {
//    println("sfsdfsdf")
//    plus(it)
//}