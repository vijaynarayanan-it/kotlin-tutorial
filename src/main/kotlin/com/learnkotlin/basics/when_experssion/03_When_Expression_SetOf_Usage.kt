package com.learnkotlin.basics.when_experssion

import com.learnkotlin.basics.when_experssion.Font.*;

fun main() {
    val fontSize = getFontSize(CALIBRI, ARIAL)
    println(fontSize)
}

/**
 * setOf(..)
 *
 * 1. returns read-only set with specified values.
 * 2. maintains the order of the values they were stored.
 *
 * ex:
 *  val set1 = setOf(1, 2, 3)
 *  val set2 = setOf(3, 2, 1)
 *
 *  println(set1) // [1, 2, 3]
 *  println(set2) // [3, 2, 1]
 *
 * 3. set with same elements are equal no matter of order.
 *  println("${set1 == set2}") // true
 */
fun getFontSize(fontOne: Font, fontTwo: Font) : Int {
    return when (setOf(fontOne, fontTwo)) {
        setOf(ARIAL, CALIBRI) -> 20
        setOf(TIMES_NEW_ROMAN, UNKNOWN) -> 12
        else -> 0
    }
}