package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        String name = formatName("Raymond","Melly");
        System.out.println(name);
    }

    public static String formatName(String first, String last) {
        // Return a formatted string ("last, first")
        return first + "," + last;
    }
}
