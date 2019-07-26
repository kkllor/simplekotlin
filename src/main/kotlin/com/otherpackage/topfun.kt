package com.otherpackage

public inline fun <T, R> T.let1(block: (T) -> R): R {
    return block(this)
}