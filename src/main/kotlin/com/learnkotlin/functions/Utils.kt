/**
 * Below annotation helps us to create a custom name for the class name
 * Without using this annotation we need to call isValidString
 * method in any Java class using UtilsKt.isValidString(..) method.
 *
 * We need to make sure this annotation should always present
 * in the first line of the class and before the package declaration.
 */
@file:JvmName("Validator")
package com.learnkotlin.functions

fun isValidString(data: String) : Boolean {
    return data.isNotEmpty()
}