package com.learnkotlin.basics.if_experssion

fun main() {
    val weatherType = getWeatherType(26)

    println(weatherType)
}

fun getWeatherType(celsius: Int): String {
    if (celsius < 10) {
        return "Cold"
    } else if (celsius in 10..25) {
        return "Normal"
    } else {
        return "Hot";
    }
}