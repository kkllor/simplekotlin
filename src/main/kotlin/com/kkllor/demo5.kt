package com.kkllor

class Sea(area: Int) {


    var area: Int = 0
        get() = field + 1
        set(value) {
            if (value > 100) {
                field = value
            }
        }

    init {
        this.area = area
    }

    override fun toString(): String {
        return area.toString()
    }
}

fun main(array: Array<String>) {
    val sea = Sea(1000);
    sea.area = 5
    sea.also(::println)
    sea.area.also(::println)
}