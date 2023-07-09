package com.learnkotlin.basics.functions

/**
 * 1. In kotlin main function argument parameter is optional.
 * 2. we can have method without defining it under a class in a kotlin class file.
 *
 */
fun main(args : Array<String>) {
    val vmArgument = if (args.isNotEmpty()) args[0] else "No Argument"
    println("Hello, $vmArgument !")
}