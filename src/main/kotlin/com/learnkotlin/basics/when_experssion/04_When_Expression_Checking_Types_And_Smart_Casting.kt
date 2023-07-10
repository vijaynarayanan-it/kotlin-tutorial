package com.learnkotlin.basics.when_experssion

open class Pet(open val noOfLegs: Int)

data class Cat(override val noOfLegs: Int, val name: String) : Pet(noOfLegs) {
    fun meow() : String {
        return "Cat named as $name with $noOfLegs legs says meow !"
    }
}

data class Dog(override val noOfLegs: Int, val name: String) : Pet(noOfLegs) {
    fun woof() : String {
        return "Dog named as $name with $noOfLegs legs says woof woof !"
    }
}