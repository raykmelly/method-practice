package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {
        // Test's to verify the methods: isEven(), and isPositive() work with
        // multiple different inputs
        int testNum1 = 5;
        System.out.printf("Is %d even: %b",testNum1,isEven(testNum1));

        int testNum2 = 10;
        System.out.printf("Is %d positive: %b",testNum2,isPositive(testNum2));
    }

    // Return a boolean: if a number is even or not
    public static boolean isEven(int num){
        return num % 2 == 0;
    }

    // Return a boolean: if a number is positive or not
    public static boolean isPositive(int num) {
        return num > 0;
    }
}
