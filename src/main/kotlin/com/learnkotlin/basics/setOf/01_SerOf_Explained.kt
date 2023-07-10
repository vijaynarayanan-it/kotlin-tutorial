package com.learnkotlin.basics.setOf

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
fun main() {
    val mutableSetValues = getMutableSet()
    mutableSetValues.add(4)

    println("Mutable set values are : $mutableSetValues")

    val immutableSetExOne = getImmutableSet()
    // immutableSetExOne.add(4) -> Unresolved reference: add. We cannot modify the immutable Set.

    println("Immutable set values are : $immutableSetExOne")

    val immutableStringSet = getImmutableStringSet()
    println("Immutable string set Values are : $immutableStringSet")
}

fun getMutableSet(): MutableSet<Int> {
    return mutableSetOf(3, 2, 1)
}

fun getImmutableSet(): Set<Int> {
    /**
     * Even though we are returning mutable set below, the return type of the
     * function is Set<Int>. So it will return immutable set.
     */
    return mutableSetOf(9, 8, 7)
}

fun getImmutableStringSet(): Set<String> {
    return setOf("Vijay", "Narayanan")
}