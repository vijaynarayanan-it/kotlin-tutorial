package com.learnkotlin.basics.loops

fun main() {

    val index = 10
    var itr = 0
    while (itr < index) {
        println("Yo, whats up! $itr")
        itr += 1
    }

    while (true) {
        print("yo, Vj!")
        break
    }
}