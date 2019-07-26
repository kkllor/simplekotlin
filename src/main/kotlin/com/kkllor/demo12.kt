package com.kkllor

fun main(args: Array<String>) {
    testClass.create()
//    var tt = testClass()
//    tt.create1()
}


class testClass {


//    fun create1() {
//
//    }

    companion object {
        fun create(): testClass = testClass()
    }

}