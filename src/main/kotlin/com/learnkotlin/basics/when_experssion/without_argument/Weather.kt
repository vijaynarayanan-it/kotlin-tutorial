package com.learnkotlin.basics.when_experssion.without_argument

import java.awt.Color

fun main() {
    updateWeather(10)
}

fun updateWeather(degrees: Int) {
    val (description, color) = when {
        degrees < 5 -> "Cold" to Color.RED
        degrees < 25 -> "wind cold" to Color.ORANGE
        else -> "Normal" to Color.GREEN
    }

    println("Updated weather description is $description and color is $color")
}