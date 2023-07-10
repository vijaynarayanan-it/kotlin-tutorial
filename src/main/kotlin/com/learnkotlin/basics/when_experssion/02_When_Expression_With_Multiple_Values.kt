package com.learnkotlin.basics.when_experssion

fun main() {
    println(getAgreementMessage("y"))

    println(getAgreementMessage("NO"))

    println(getAgreementMessage(""))
}

fun getAgreementMessage(userInput: String): String {
    return when(userInput) {
        "y", "yes", "YES" -> "I'm glad you agree !"
        "n", "no", "NO" -> "Sorry to hear that !"
        else -> "I don't understand you !"
    }
}