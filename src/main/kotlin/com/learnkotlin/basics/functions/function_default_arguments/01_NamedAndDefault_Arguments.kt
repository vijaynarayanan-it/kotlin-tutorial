package com.learnkotlin.basics.functions.function_default_arguments

/**
 * below function explains how named and default arguments applied in Kotlin.
 */
fun main() {
    /**
     * joinToString(..) method has 3 arguments called separator, prefix, postfix. And these arguments are
     * having default values as follows:
     * joinToString(separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", etc...)
     *
     *
     * in order to assign values for each 3 arguments we need to assign values to appropriate argument names.
     * ex: separator = "*"
     */
    println(listOf("A", "B", "C").joinToString(separator = ", ", prefix = "[", postfix = "]")) // output -> [A, B, C]

    /**
     * by default compiler assign the default value ' "," ' to separator argument.
     */
    println(listOf("A", "B", "C").joinToString()) // output -> A, B, C

    /**
     * by default compiler assign the " | " value to separator argument, since it is the first argument.
     */
    println(listOf("D", "E", "F").joinToString(" | ")) // output -> D | E | F

    /**
     * in the below joinToString(..) function we are passing only prefix value and compiler will
     * consider default values for remaining parameter arguments.
     */
    println(listOf("G", "H", "I").joinToString(prefix = "* ")) // output -> * G, H, I

    /**
     * in the below joinToString(..) function we are passing only postfix value and compiler will
     * consider default values for remaining parameter arguments.
     */
    println(listOf("J", "K", "L").joinToString(postfix = " .")) // output -> J, K, L .
}