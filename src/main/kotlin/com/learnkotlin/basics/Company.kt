@file:JvmName("Company")
package com.learnkotlin.basics

/**
 * Below class syntax eliminates Java's boilerplate code like:
 * 1. Getters and Setters
 * 2. Constructor with all arguments
 */
class Company (val id: Int, val name: String, val location: String) {
}

fun main() {
    val company = Company(1, "Microsoft", "Amsterdam");

    println("Id is : " + company.id)
    println("Name is : " + company.name)
    println("Location is : " + company.location)
}