@file:JvmName("Company")
package com.learnkotlin.basics

/**
 * Below class syntax eliminates Java's boilerplate code like:
 * 1. Getters and Setters
 * 2. Constructor with all arguments
 */
class Company (val id: Int, val name: String, val location: String) {

}

/**
 * Below is an example of a class without class body ( {..} ) syntax.
 *
 */
class Employee (val id: Int, val name: String, val salary: Float)

/**
 * Below is an example of a class with default arguments.
 *
 * Example:
 *
 * 1. If we don't pass id parameter, then compiler will take 0 as a default id.
 * 2. If we don't pass name parameter, then compiler will take Unknown as a default name.
 * 3. If we don't pass any arguments then compiler will consider default values for the object.
 */
class Manager (val id: Int = 0, val name: String ? = "Unknown")

fun main() {
    /**
     * Creating company object without new keyword.
     */
    val company = Company(1, "Microsoft", "Amsterdam")

    println("Company Id is : " + company.id)
    println("Company Name is : " + company.name)
    println("Company Location is : " + company.location)

    val employee = Employee(1, "Vijay", 4200.34f)

    println("Employee Id is : " + employee.id)
    println("Employee Name is : " + employee.name)
    println("Employee Salary is : " + employee.salary)

    /**
     * Since Manager class has default values for all arguments, we can even
     * create an object with no arguments.
     */
    val localManager = Manager()
    println("Local Manager Id is : " + employee.id) // output -> Local Manager Id is :  0 (default value)
    println("Local Manager Name is : " + employee.name) // output -> Local Manager Name is : Unknown (default value)

    /**
     * Passing id argument alone to create Manager object.
     */
    val frontDeskManager = Manager(1)
    println("FrontDesk Manager Id is : " + employee.id) // output -> FrontDesk Manager Id is : 1
    println("FrontDesk Manager Name is : " + employee.name) // output -> FrontDesk Manager Name is : Unknown (default value)

    /**
     * Passing name argument alone to create Manager object.
     */
    val middleDeskManager = Manager(name = "Vijay")
    println("MiddleDesk Manager Id is : " + employee.id) // output -> MiddleDesk Manager Id is : 0 (default value)
    println("MiddleDesk Manager Name is : " + employee.name) // output -> MiddleDesk Manager Name is : Vijay

    /**
     * Passing id and name argument to create Manager object.
     */
    val backDeskManager = Manager(2, "Vijay")
    println("BackDesk Manager Id is : " + employee.id) // output -> BackDesk Manager Id is : 2
    println("BackDesk Manager Name is : " + employee.name) // output -> BackDesk Manager Name is : Vijay
}