package com.jungle

class Student(val sno: String, val grade: Int) : Person(), Study {
    override fun readBooks() {
        println("$name read book now")
    }

    override fun doHomeWork() {
        println("$name do homework now")
    }

}