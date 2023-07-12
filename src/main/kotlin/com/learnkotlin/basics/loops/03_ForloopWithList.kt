package com.learnkotlin.basics.loops

fun main() {
    val list = listOf("Alex", "Bram", "Crista")

    for (name in list) {
        println("name is : $name")
    }

    for((index, element) in list.withIndex()) {
        println("Element : $element at $index position")
    }

    for (name in list.reversed()) {
        println("Reversed name : $name")
    }
}