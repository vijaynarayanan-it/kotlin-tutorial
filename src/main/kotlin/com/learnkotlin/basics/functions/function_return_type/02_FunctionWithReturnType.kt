package com.learnkotlin.basics.functions.function_return_type

fun main() {
    val responseCode = getResponseCode("Ok")
    println(responseCode)
}

/**
 * Below method explains the syntax of a function with return type declaration.
 *
 * We need to specify the return type as below
 *
 * someMethodName(..) : String {
 *   .....
 * }
 *
 */
fun getResponseCode(status: String) : Int {
    if (status == "Ok") {
        return 200
    } else {
        return 404
    }
}

/**
 * Simplified version 1.
 *
 */
fun getResponse(status: String) : String {
    return if (status == "Ok") "Created" else "Not created"
}

/**
 * Simplified version 2.
 */
fun getResponseData(status: String) : String = if (status == "Ok") "Data 1" else "No data"