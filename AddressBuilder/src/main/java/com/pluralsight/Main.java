package com.pluralsight;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Prompt for user input
        String fullName = promptForString("Full name: ");

        // Create StringBuilder for addresses
        StringBuilder billingAddress = new StringBuilder("Billing Address:\n");
        StringBuilder shippingAddress = new StringBuilder("Shipping Address:\n");

        // Collect Billing Address information
        String billingStreet = promptForString("Billing Street: ");
        String billingCity = promptForString("Billing City: ");
        String billingState = promptForString("Billing State: ");
        String billingZip = promptForString("Billing Zip: ");

        // Build Billing Address
        billingAddress.append(billingStreet).append("\n")
                .append(billingCity).append(", ").append(billingState).append(" ").append(billingZip).append("\n");

        // Shipping Address information
        String shippingStreet = promptForString("Shipping Street: ");
        String shippingCity = promptForString("Shipping City: ");
        String shippingState = promptForString("Shipping State: ");
        String shippingZip = promptForString("Shipping Zip: ");

        // Build Shipping Address
        shippingAddress.append(shippingStreet).append("\n")
                .append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip).append("\n");

        // Display information
        System.out.println("----------------------");
        System.out.println(fullName);
        System.out.println(); // This adds a blank line for spacing
        System.out.println(billingAddress);
        System.out.println(shippingAddress);

    }

    // Method to prompt for a string input
    public static String promptForString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}
