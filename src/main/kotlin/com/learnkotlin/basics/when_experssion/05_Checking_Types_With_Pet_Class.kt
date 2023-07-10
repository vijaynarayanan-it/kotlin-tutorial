package com.learnkotlin.basics.when_experssion

fun main() {
    val catInstance = Cat(4, "Alex")
    println(printPetDetailsBasedOnType(catInstance))

    val dogInstance = Dog(4, "Shabby")
    println(printPetDetailsBasedOnType(dogInstance))

    /**
     * capturing when subject in a variable.
     */
    val instance = getPetInstance()
    when(instance) {
        is Cat -> instance.meow()
        is Dog -> instance.woof()
        else -> "Type is unknown"
    }
    println(printPetDetailsBasedOnType(instance))

    /**
     * Capturing when subject in a variable (local)
     */
    val printData = when (val instance = getPetInstance()) {
        is Cat -> instance.meow()
        is Dog -> instance.woof()
        else -> "Unknown instance"
    }
    println(printData)
}

fun getPetInstance(): Pet {
    return Pet(4)
}
fun printPetDetailsBasedOnType(pet: Pet) : String {
    return when(pet) {
        is Cat -> pet.meow()
        is Dog -> pet.woof()
        else -> "Type is unknown"
    }
}