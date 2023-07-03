package com.learnkotlin.basics

/**
 * Below main function doesn't have arguments like java's main method.
 */
fun main() {
    println("First arg : ${printArgs()} , Second arg : ${printArgs()}")

    /** output:
     * Gonna print
     * Gonna print
     * First arg : Argument , Second arg : Argument
     */
}

fun printArgs(): String {
    println("Gonna print")
    return "Argument"
}