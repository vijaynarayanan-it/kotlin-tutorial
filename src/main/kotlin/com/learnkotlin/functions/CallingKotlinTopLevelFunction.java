package com.learnkotlin.functions;

public class CallingKotlinTopLevelFunction {
    public static void main(String[] args) {
        /**
         * In the below line we are calling isValidString top-level
         * function from Utils.kt class.
         *
         * In the Utils.kt class we annotated @file:JvmName("Validator")
         * That's why we are able to call isValidString using Validator.isValidString(..)
         */
        boolean isValid = Validator.isValidString("");
        System.out.println("Is Valid string : " + isValid);

        boolean isValidString = Validator.isValidString("Kotlin");
        System.out.println("Is Valid string : " + isValidString);
    }
}
