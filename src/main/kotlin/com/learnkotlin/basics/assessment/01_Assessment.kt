package com.learnkotlin.basics.assessment

/**
 * Question:
 *
 * Implement the function that checks whether a string is a valid identifier.
 * A valid identifier is a non-empty string that starts with a letter or underscore
 * and consists of only letters, digits and underscores.
 *
 */
fun isValidIdentifier(str: String): Boolean {
    /**
     * If the string is empty then returns false.
     */
    if (str.isEmpty()) return false

    /**
     * Character codes:
     * 65 to 90  -> A..Z
     * 97 to 122 -> a..z
     * 48 to 57  -> 0..9
     *
     * 95 -> underscore _
     */

    /**
     * Below if condition checks whether the first character
     * not starts with a letter or underscore.
     *
     * If yes, returns false.
     * If no (starts with a letter or underscore), returns true.
     */
    if (str[0].code !in 97..122 &&
        str[0].code !in 65..90 &&
        str[0].code != 95) return false

    /**
     * Below if condition checks whether the first character
     * not starts with a letter or underscore or number.
     *
     * If it starts with letter or underscore or number then returns true.
     * If not returns false.
     */
    for (char in str.substring(1)){
        println(char.code)
        if (char.code !in 97..122 &&
            char.code !in 65..90 &&
            char.code !in 48..57 &&
            char.code != 95) return false
    }

    return true
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}