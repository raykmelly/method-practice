package com.pluralsight;

public class Menu {
    public static void main(String[] args) {
        // Call the displayMenu() method twice to see if it works
        displayMenu();
        displayMenu();
    }

    public static void displayMenu() {
        // Print statements for the display
        System.out.println("=== MENU ===");
        System.out.println("1. Coffee - $3.99");
        System.out.println("2. Tea - $2.99");
        System.out.println("3. Cookie - $1.99\n");
    }
}
