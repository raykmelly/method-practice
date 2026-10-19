package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        // Make a variable and set it to what formatName() returns
        // then print what the variable is
        String name = formatName("Raymond","Melly");
        System.out.println(name);
    }

    // Method to format a string, takes in two parameters: first and last,
    // then returns it formatted like: last + "," + first.
    public static String formatName(String first, String last) {
        // Return a formatted string ("last, first")
        return first + "," + last;
    }
}
