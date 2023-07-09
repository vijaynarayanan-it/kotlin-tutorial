package com.learnkotlin.basics.variables

/**
 * val keyword comes from value variable.
 * means it is read only or assign once variables
 */
fun main() {
    val id = 1
    println("Id is : $id")

    modifyObjectStoredInVal()

    modifyImmuatbleDataStoredInVal()
}

/**
 * We can modify object which is stored in val variable.
 * But the object should be mutable. Otherwise, we are not able to modify immutable object.
 */
private fun modifyObjectStoredInVal() {
    val muatbleList = mutableListOf("Java", "Kotlin")
    muatbleList.add("Ruby")

    println("$muatbleList")
}

/**
 * In this method we are trying to modify the immutable object.
 * So compiler will not be able to resolve reference "add method in line number 33".
 */
private fun modifyImmuatbleDataStoredInVal() {
    val muatbleList = listOf("Java", "Kotlin")

    // muatbleList.add("Ruby") -------> Unresolved reference: add

    println("$muatbleList")
}

