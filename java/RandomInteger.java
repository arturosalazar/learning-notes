// Demonstrates the use of the Random class to generate pseudo-random numbers in Java.
// This example focuses on generating a random integer within a specified range, mimicking the roll of a die.

import java.util.Random;

public class RandomInteger {
    public static void main(String[] args) {
        System.out.println("This program demonstrates how to generate random numbers using the Random class.");

        // Instantiate a Random object.
        // The Random class allows generating different kinds of random numbers,
        // including integers, doubles, booleans, etc.
        Random random = new Random();

        // Generate a random integer using nextInt().
        // nextInt(int bound) generates a random integer from 0 (inclusive) to the
        // specified bound (exclusive).
        // To simulate a die roll, we generate a number between 0 and 5, then add 1 to
        // shift the range to 1-6.
        // This simulates the roll of a die, providing a random result between 1 and 6,
        // inclusive.
        int die = random.nextInt(6) + 1;
        System.out.println("The random value of the die is: " + die);
    }
}
