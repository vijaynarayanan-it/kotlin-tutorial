package com.learnkotlin.basics.functions.function_return_type

fun main() {
    printErrorMessage("Ok")
}

/**
 * usual function declaration. within parameter,
 * we should first mention the name of the argument and then its type.
 *
 * Since we are not returning anything, this function's default return type is 'Unit'.
 * 'Unit' is equivalent to void return type in Java.
 *
 * ex: *****(status: String, age: Unit)
 */
fun printErrorMessage(status: String) {
    if (status == "Ok") {
        println("200")
    } else {
        println("404")
    }
}

/**
 * Below method is the simplified version of printErrorMessage method.
 * We can
 */
fun printMessage(status: String) = if (status == "Ok") println("200") else println("404")