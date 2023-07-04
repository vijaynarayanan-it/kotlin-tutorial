package com.learnkotlin.function_arguments

/**
 * below function has two arguments called recurseCount and message.
 * Each argument has default values. Syntax for setting default value is:
 *
 * ex: someMethod(age: Int = 18) --> here 18 is the default age.
 *
 * Why default arguments are introduced in Kotlin and how it benefits?
 *
 * In Java if we want to achieve the below implementation, we need to write
 * multiple overload functions.
 *
 * But In Kotlin, we can easily eliminate creation of multiple overload functions
 * by using default argument values.
 */
fun print(recurseCount: Int = 1, message: String = "#") {
    repeat(recurseCount) {
        print(message);
    }
}

fun main() {

    /**
     * In the below execution we are passing all required arguments with custom values.
     *
     * Since we are providing the values for each argument, the default values will be
     * overridden.
     */
    print(recurseCount = 5, message = "*") // output -> *****

    /**
     * In the below execution we are passing only recurseCount value and compiler will take the
     * default value for message argument.
     *
     * Since ' # ' is the default value for message argument, it gets printed for 3 times.
     */
    print(3) // output -> ###

    /**
     * In the below execution we are passing only the message value and compiler will take the
     * default value for recurseCount argument.
     *
     * Since ' 1 ' is the default value for recurseCount argument, given data gets printed for 1 time.
     */
    print(message = "%") // output -> %

    /**
     * Below execution explains we can also pass the values for the arguments in our desired orders.
     * But we should pass the values along with the appropriate argument names.
     */
    print(message = "Hello", recurseCount = 1)

    /**
     * In the below execution we are not passing any arguments and compiler consider the default values
     * and execute it.
     *
     * Since 1 and # is the default values for recurseCount and message, it gets printed as below.
     */
    print(); // output -> #
}