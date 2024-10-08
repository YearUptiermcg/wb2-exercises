package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create the first cell phone
        CellPhone cellPhone1 = new CellPhone();
        System.out.print("What is the serial number for phone 1? ");
        cellPhone1.setSerialNumber(scanner.nextInt());
        scanner.nextLine(); // Consume newline
        System.out.print("What model is the phone? ");
        cellPhone1.setModel(scanner.nextLine());
        System.out.print("Who is the carrier? ");
        cellPhone1.setCarrier(scanner.nextLine());
        System.out.print("What is the phone number? ");
        cellPhone1.setPhoneNumber(scanner.nextLine());
        System.out.print("Who is the owner of the phone? ");
        cellPhone1.setOwner(scanner.nextLine());

        //  using the overloaded constructor
        CellPhone cellPhone2 = new CellPhone(2597153, "iPhone 15 Pro Max", "Verizon", "888-555-1234", "Sandra");

        // Display information about both cell phones
        display(cellPhone1);
        display(cellPhone2);

        // First cell phone dials the second one
        cellPhone1.dial(cellPhone2.getPhoneNumber());

        // Second cell phone dials the first one
        cellPhone2.dial(cellPhone1.getPhoneNumber());

        // Dial using the overloaded method
        cellPhone1.dial(cellPhone2);
        cellPhone2.dial(cellPhone1);

        scanner.close();
    }

    // Static method to display cell phone information
    public static void display(CellPhone phone) {
        System.out.println("\nCell Phone Information:");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println();
        System.out.println("Owner: " + phone.getOwner());
    }
}
