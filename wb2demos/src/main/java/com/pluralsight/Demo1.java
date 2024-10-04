package com.pluralsight;

import java.util.regex.Pattern;

public class Demo1 {
    public static void main(String[] args) {
        // String contains "id|description|quantity|price"
        //                 0     1           2       3

        String input = "111|Hot Chocolate (12-count)|21|4.99";
        String[] tokens = input.split(Pattern.quote("|"));

        // Corrected lines: Removed extra closing parentheses
        int id = Integer.parseInt(tokens[0]);
        String name = tokens[1];
        int quality = Integer.parseInt(tokens[2]);
        double price = Double.parseDouble(tokens[3]);

        // Optional: Print the parsed values to verify
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Quality: " + quality);
        System.out.println("Price: " + price);
    }
}
