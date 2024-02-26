
// Demonstrates the use of switch statements in Java.
// A switch statement offers a clearer and more concise alternative to a series of if-else-if statements.
// It takes in a value and compares it against specified cases, executing the code associated with the first matching case.
import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        // Initialize scanner object for reading input from the console.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a grade for feedback.
        System.out.println("Grade Feedback");
        System.out.println("Enter a grade and I will provide feedback!\n");
        System.out.println("Please type in a grade - A, B, C, D, or F");

        // Read the grade input from the user.
        String grade = scanner.next();

        String message;

        // Using a switch statement to assign a feedback message based on the grade
        // entered.
        // This demonstrates how switch can simplify multiple conditional checks.
        switch (grade) {
            case "A":
                message = "Excellent Job!";
                break; // Exits the switch block if this case is matched.
            case "B":
                message = "Good Job!";
                break;
            case "C":
                message = "Ok!";
                break;
            case "D":
                message = "Needs work";
                break;
            case "F":
                message = "Failed";
                break;
            default: // Executes if none of the above cases match the input.
                message = "Invalid Grade Entered";
        }

        // Output the feedback message.
        System.out.println(message);

        // Close the scanner to prevent resource leaks.
        scanner.close();
    }
}
