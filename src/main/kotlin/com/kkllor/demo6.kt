package com.kkllor

class School(name: String) {
    private var name1: String = name + 123

    fun printName() {
        println(name1)
    }
}

fun f1(bar: Int = 0, baz: Int = 1, qux: () -> Unit) {
    println("bar=$bar,baz=$baz")
    qux.invoke()
}

fun main(args: Array<String>) {
    School("hello").printName()
    f1(1, 2, { println("hello") })
}