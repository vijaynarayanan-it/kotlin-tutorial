package com.learnkotlin.basics

/**
 * Below main function doesn't have arguments like java's main method.
 */
fun main() {
    println("First arg : ${printArgument()} , Second arg : ${printArgument()}")

    /** output:
     * Gonna print
     * Gonna print
     * First arg : Argument , Second arg : Argument
     */
}

fun printArgument(): String {
    println("Gonna print")
    return "Argument"
}