package com.learnkotlin.basics.loops

fun isLetter(char: Char) = char in 'a'..'z' || char in 'A'..'Z'

fun isNotDigit(char: Char) = char !in '0'..'9'

fun findType(char : Char) : String = when(char) {
    in '0'..'9' -> "Integer"
    in 'a'..'z', in 'A'..'Z' -> "Character"
    else -> "UNKNOWN"
}

fun main() {
    println("Is 'a' character : ${isLetter('a')}")
    println("Is 'Z' character : ${isLetter('Z')}")
    println("Is '*' character : ${isLetter('*')}")

    println("Is '9' not digit : ${isNotDigit('9')}")
    println("Is 'd' not digit : ${isNotDigit('d')}")

    println("Type of * : ${findType('*')}")
    println("Type of f : ${findType('f')}")
    println("Type of 8 : ${findType('8')}")

    /**
     *  For below statement output is true.
     *  Because "K" in Kotlin word lies between first char of Java and Scala. K between J and S.
     */
    println("Kotlin" in "Java".."Scala") // output -> true.

    /**
     * Here we are checking whether Kotlin word present in setOf(..) values
     */
    println("Kotlin" in setOf("Java", "Scala"))

    val names = listOf("Ajay", "Vijay", "Sham")
    if ("Sham" in names) {
        println("Sham name found in the name list!")
    } else {
        println("Sham name not found!")
    }
}
