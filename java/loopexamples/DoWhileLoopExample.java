package loopexamples;

import java.util.Scanner;

// Demonstrates using a do-while loop for input validation to ensure user input meets specific criteria in Java.
public class DoWhileLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for reading user input from the console.
        double rate = 16.50; // Fixed hourly rate for wage calculation.
        double hoursWorked = 0; // Initial hours worked, set to 0 before user input.

        // The do-while loop ensures that the input for hours worked does not exceed 40
        // hours.
        do {
            System.out.println("Provide hours worked. You cannot exceed 40 hours per week");
            hoursWorked = scanner.nextDouble();
        } while (hoursWorked > 40);

        // Displays the total hours worked, hourly rate, and total pay, formatted to two
        // decimal places.
        System.out.printf("You worked %.2f hours at a rate of $%.2f per hour. Total Pay: $%.2f", hoursWorked, rate,
                hoursWorked * rate);

        scanner.close(); // Close the scanner to free system resources associated with it.
    }
}