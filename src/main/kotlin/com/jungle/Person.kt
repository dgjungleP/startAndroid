package com.jungle

open class Person {
    var name = "";
    var age = 0;
    fun eat() {
        println("$name is eating, He is $age years old.")
    }
}


fun main() {
    var p =Person()
    p.age=10
    p.name="Jungle"
    p.eat()
    var s =Student("2125",10)

    doStudy(s)
}

fun doStudy(s: Study) {
    s.doHomeWork()
    s.readBooks()
}

