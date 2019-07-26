package com.kkllor

open class Person(name: String) {
    var name: String
    var upperName = name.toUpperCase()

    init {
        println("first initializer block that prints $name")
        this.name = name
    }

    fun f1() {
        println(name)
        println("upper name is $upperName")
    }

    fun f2(v1: String = "default1", v2: String) {
        println(v1 + v2)
        when {
            v1.equals("default1") -> {
                println("params v1 is not asigned")
            }
            else -> {
                println("v1 is $v1")
            }
        }
    }
}

open class Animal {
    init {
        println("init Aniaml")
    }

    constructor(color: String, weight: Double, height: Double) {
        println(" color is $color,weight is $weight,height is $height")
    }

    fun printSuperClassName() {
        javaClass.superclass.simpleName.also(::println)
    }
}

class Cat(jump: Double, weight: Double, height: Double, color: String) : Animal(color, weight, height) {
    constructor(likeDog: Boolean, jump: Double, weight: Double, height: Double) : this(jump,weight,height,color = "blue") {
        println("likeDog is $likeDog,jump is $jump,weight is $weight,height is $height")
    }
}

fun main(args: Array<String>) {
//    val person = Person("zhang san")
//    person.f1()
//    person.f2(v2 = "v2")
//    person.f2("v1", "v2")
//    val animal = Animal(123.1, 234.2)
//    animal.printSuperClassName()
//    val cat1 = Cat(2.3, 10.3, 0.32)
    val cat2 = Cat(false, 2.3, 10.3, 0.32)

}
