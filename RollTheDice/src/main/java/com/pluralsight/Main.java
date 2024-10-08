package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int roll1, roll2;
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for (int i = 0; i < 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;

            // Print the rolls and their sum
            System.out.printf("Roll %d: %d - %d Sum: %d%n", i + 1, roll1, roll2, sum);

            // Count occurrences of specific sums
            if (sum == 2) {
                twoCounter++;
            }
            if (sum == 4) {
                fourCounter++;
            }
            if (sum == 6) {
                sixCounter++;
            }
            if (sum == 7) {
                sevenCounter++;
            }
        }

        // Display the counts
        System.out.println("Count of 2s: " + twoCounter);
        System.out.println("Count of 4s: " + fourCounter);
        System.out.println("Count of 6s: " + sixCounter);
        System.out.println("Count of 7s: " + sevenCounter);
    }
}
