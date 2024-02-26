
// Demonstrates the use of switch expressions in Java.
// Unlike switch statements, switch expressions are used to directly return a value based on a matching case.
// This feature simplifies the syntax for assigning a value to a variable based on conditional logic.
import java.util.Scanner;

public class SwitchExpressions {
    public static void main(String[] args) {
        // Initialize the scanner object to capture user input from the console.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to provide a grade, offering feedback based on the grade
        // submitted.
        System.out.println("Grade Feedback");
        System.out.println("Enter a grade and I will provide feedback!\n");
        System.out.println("Please type in a grade - A, B, C, D, or F");

        // Capture the grade input as a String.
        String grade = scanner.next();

        // Utilize a switch expression to directly assign a feedback message to the
        // `message` variable.
        // Each case in the switch expression uses the '->' arrow to directly return a
        // value, making the code more concise.
        // This approach eliminates the need for break statements and allows for a more
        // functional style of coding.
        String message = switch (grade) {
            case "A" -> "Excellent Job!";
            case "B" -> "Good Job!";
            case "C" -> "Ok!";
            case "D" -> "Needs work";
            case "F" -> "Failed";
            default -> "Invalid Grade Entered"; // Handles any input that doesn't match the known grades.
        };

        // Display the generated feedback message to the user.
        System.out.println(message);

        // Close the scanner object to free up system resources and prevent leaks.
        scanner.close();
    }
}
