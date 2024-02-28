// Demonstrates the use of String.format() for formatting strings in Java.
// This example shows how to format numerical values into a more readable string format,
// especially useful for displaying user-friendly messages or logging.

public class StringFormat {
    public static void main(String[] args) {
        // Example of floating point variable to format.
        double pi = Math.PI;

        // Using String.format() to format a double value (pi) with precision.
        // Here, %.2f is a format specifier that formats the floating-point
        // number to two decimal places.
        String formattedPi = String.format("Formatted Pi value: %.2f", pi);
        System.out.println(formattedPi);
    }
}
