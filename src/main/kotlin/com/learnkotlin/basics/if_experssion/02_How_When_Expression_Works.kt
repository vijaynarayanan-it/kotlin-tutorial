package com.learnkotlin.basics.if_experssion

fun main() {
    val fontSize = getDefaultFontSize(Font.ARIAL)
    println(fontSize)

    val fontSizeOne = getDefaultFontSize1(Font.CALIBRI)
    println(fontSizeOne)

    val defaultFontSize = getDefaultFontSize2(Font.UNKNOWN)
    println(defaultFontSize)
}

enum class Font {
    ARIAL, CALIBRI, TIMES_NEW_ROMAN, UNKNOWN
}

/**
 * when is similar to switch case in java.
 * 1. using when we can eliminate lots of boilerplate code
 * ex: break statement within each case conditions.
 *     default statement can be replaced with else condition.
 */
fun getDefaultFontSize(font: Font) : Int {
    when(font) {
        Font.ARIAL -> return 16
        Font.CALIBRI -> return 13
        Font.TIMES_NEW_ROMAN -> return 12
        else -> return 9
    }
}

/**
 * Another way to return the value from when.
 * syntax: return when(font)
 */
fun getDefaultFontSize1(font: Font) : Int {
    return when(font) {
        Font.ARIAL -> 16
        Font.CALIBRI -> 13
        Font.TIMES_NEW_ROMAN -> 12
        else -> 9
    }
}

/**
 * Example method of when statement as expression
 */
fun getDefaultFontSize2(font: Font) = when(font) {
        Font.ARIAL -> 16
        Font.CALIBRI -> 13
        Font.TIMES_NEW_ROMAN -> 12
        else -> 9
}