package com.pluralsight;

import java.util.Random;

public class Dice {
    private Random random;

    public Dice() {
        random = new Random();
    }

    public int roll() {
        return random.nextInt(6) + 1; // Generates a number between 1 and 6
    }
}
