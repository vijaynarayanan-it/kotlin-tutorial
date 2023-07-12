package com.learnkotlin.basics.loops

fun main() {
    includingUpperBound()

    println("\n*************")

    // excluding upper bound (9)
    excludingUpperBound()

    println("\n*************")

    for (i in 10 downTo 1 step 2) {
        print(i)
    }

    println("\n*************")

    printListValuesInReverseOrderUsingDownTo()

    println("\n*************")

    for (i in 0..8 step 2) {
        print(i)  // output -> 02468
    }

    println("\n*************")

    printNumbersWithStepCondition()

    println("\n*************")

    usingFilterConditionOnRange()
}

private fun usingFilterConditionOnRange() {
    val filteredValues = (1..10).filter { it % 2 == 0 }
    println("Filtered values are : $filteredValues")
}

@OptIn(ExperimentalStdlibApi::class)
private fun printNumbersWithStepCondition() {
    for (i in 0..<8 step 2) {
        print(i) // output -> 0246
    }
}

private fun printListValuesInReverseOrderUsingDownTo() {
    val list = listOf("A", "B", "C", "D")

    for (i in list.size - 1 downTo 0) { // list.size -1 -> 3. So 0 to 3
        println(list[i])
    }
}

private fun excludingUpperBound() {
    for (i in 1 until 9) {
        print("$i") // output -> 12345678
    }
}

private fun includingUpperBound() {
    // including upper bound (9)
    for (i in 1..9) {
        print("$i") // output -> 123456789
    }
}