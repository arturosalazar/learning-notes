package loopexamples;

import java.util.Scanner;

// Demonstrates using a for loop to calculate the total cost of a variable number of items entered by the user.
public class ForLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for reading user input.
        double total = 0; // Accumulator for the total cost of items.
        System.out.println("Checkout Total");

        // Ask the user for the number of items to calculate the total cost.
        System.out.println("How many items do you have? ");
        int numberOfItems = scanner.nextInt();

        // Iterate over the number of items, prompting for the cost of each item and
        // adding it to the total.
        for (int i = 0; i < numberOfItems; i++) {
            System.out.printf("Provide the value of item %d\n", i + 1);
            total += scanner.nextDouble();
        }

        // Display the total cost of the groceries, formatted to two decimal places.
        System.out.printf("The value of your groceries is $%.2f\n", total);

        scanner.close(); // Close the scanner to free system resources associated with it.
    }
}
