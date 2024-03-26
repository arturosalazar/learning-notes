package loopexamples;

import java.util.Scanner;

// Demonstrates the use of a while loop to validate user input in Java.
public class WhileLoopExample {
    public static void main(String[] args) {
        double rate = 16.50; // Hourly rate for calculation. Example uses a fixed rate.

        Scanner scanner = new Scanner(System.in); // Scanner for reading user input from the console.
        System.out.println("Provide me the hours worked, you cannot enter more than 40 hours");
        double hoursWorked = scanner.nextDouble();
        // Loop to ensure the hours worked is 40 or less. Prompts for re-entry if the
        // input is invalid.
        while (hoursWorked > 40) {
            System.out.println("You cannot enter more than 40 hours, please re-enter a different value");
            hoursWorked = scanner.nextDouble();
        }

        // Display the total hours worked, the hourly rate, and the total pay based on
        // user input.
        System.out.printf("You worked %.2f hours at a rate of $%.2f per hour. Total Pay: $%.2f", hoursWorked, rate,
                hoursWorked * rate);

        scanner.close(); // Close the scanner to free system resources associated with it.
    }
}
