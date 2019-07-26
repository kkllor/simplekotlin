package com.kkllor

fun main(args: Array<String>) {
    val map = mapOf(1 to "A", Pair(1, "A"), Pair(1, "A"))

    "A" sameAs "B"
}

infix fun String.sameAs(that: String?): Boolean {

    return this.equals(that)
}