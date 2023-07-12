package com.learnkotlin.basics.loops

fun main() {
    val personMap = mapOf(1 to "Vijay",
        2 to "Narayanan",
        3 to "Srilatha")

    for ((k,v) in personMap) {
        println("Id is : $k and name is : $v")
    }
}