package com.kkllor

//var sum: (Int, Int) -> Int = { x, y -> x + y }

fun f1(p1: String, p2: String, judage: (String, String) -> Boolean): Boolean {
    return judage(p1, p2)
}

fun f2(p1: String, judage: (String) -> Boolean): Boolean {
    return judage(p1)
}

fun containsHello(str: String): Boolean {
    return str.contains("hello")
}

fun main(args: Array<String>) {
    f2("string", ::containsHello)

}