package com.kkllor

import com.otherpackage.let1

fun main(args: Array<String>) {
    //主线程等待
    testInline("hello", { ", world" })
    args.let {  }
    args.let1 {  }

}

inline fun testInline(str: String, f: () -> String): String {
    str.toString()
    f.invoke()
    f()
    testInLine3()
//    testInline1(f)
    return str + f()
}

fun testInline1(f: () -> String) {
    f.invoke()
}


//inline fun testInLine4(str: String): String {
//    var s1 = str;
//    if (s1.length > 0) {
//        return "0"
//    } else {
//       return testInLine4(s1 + "a")
//    }
//
//}

fun testInLine3() {

//    testInline1 {
//        "asdasd"
//        return@testInLine3
//    }

}