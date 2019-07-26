package com.kkllor

fun main(args: Array<String>) {

    fun String.test1(): Boolean {
        return equals("test1")
    }

    val list = listOf("a", "b", "c", "d")
    list.filter { it.test1() }


}
