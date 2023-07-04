@file:JvmName("Validator")
package com.learnkotlin.functions

fun isValidString(data: String) : Boolean {
    return data.isNotEmpty()
}