package com.pluralsight;

public class Hello {
    public static void main(String[] args) {
        // Call the methods: sayHello(), sayGoodbye(), sayGoodMorning()
        sayHello();
        sayGoodbye();
        sayGoodMorning();
    }

    // Prints out "Hello world!" when called
    public static void sayHello() {
        System.out.println("Hello world!");
    }

    // Prints out "Goodbye!" when called
    public static void sayGoodbye() {
        System.out.println("Goodbye!");
    }

    // Prints out "Good morning!" when called
    public static void sayGoodMorning() {
        System.out.println("Good morning!");
    }
}