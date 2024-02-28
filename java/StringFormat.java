// Demonstrates the use of String.format() for formatting strings in Java.
// This example shows how to format numerical values into a more readable string format,
// especially useful for displaying user-friendly messages or logging.

public class StringFormat {
    public static void main(String[] args) {
        // Example of variables to format.
        double pi = Math.PI;
        int quantity = 5;
        double price = 8.75;

        // Using String.format() to format a double value (pi) with precision.
        // Here, %.2f is a format specifier that formats the floating-point
        // number to two decimal places.
        String formattedPi = String.format("Formatted Pi value: %.2f", pi);
        System.out.println(formattedPi);

        // Formatting and combining an integer and a double in a single string.
        // %d is used for integers, and again, %.2f for floating-point numbers.
        // This is useful for creating detailed messages with variable content.
        String orderSummary = String.format("Quantity: %d, Price per Item: $%.2f", quantity, price);
        System.out.println(orderSummary);


    }
}
