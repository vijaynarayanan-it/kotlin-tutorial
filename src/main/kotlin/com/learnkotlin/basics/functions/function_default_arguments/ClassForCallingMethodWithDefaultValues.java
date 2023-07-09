package com.learnkotlin.basics.functions.function_default_arguments;

public class ClassForCallingMethodWithDefaultValues {
    public static void main(String[] args) {
        /**
         * @see com.learnkotlin.basics.functions.function_default_arguments.PrintService#print(int, String)
         */
        PrintService.print();

        PrintService.print(1);

        PrintService.print(5, "$");
    }
}
