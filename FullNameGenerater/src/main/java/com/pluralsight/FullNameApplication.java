package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String firstName = PromptForString("First name: ");
        String middleName = PromptForString("Middle name: ");
        String lastName = PromptForString("Last name: ");
        String suffix = PromptForString("Suffix: ");

        String fullName;

        if (middleName.isBlank()) {
            if (suffix.isBlank()) {
                fullName = firstName + " " + lastName;
            } else {
                fullName = firstName + " " + lastName + ", " + suffix;
            }
        } else {
            if (suffix.isBlank()) {
                fullName = firstName + " " + middleName + " " + lastName;
            } else {
                fullName = firstName + " " + middleName + " " + lastName + ", " + suffix;
            }
        }


        System.out.println(" Hello " + fullName);
    }


    public static String PromptForString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}
