package methodarguments;

// Demonstrates the use of method parameters and method overloading by calculating sums of integers and doubles.
public class MethodArguments {
    public static void main(String[] args) {
        int firstVal = 42;
        int secondVal = 38;
        // Calling calculateSum using two integers
        System.out.printf("Integers: The sum of %d and %d is %d\n", firstVal, secondVal,
                calculateSum(firstVal, secondVal));

        double firstDouble = 65.78;
        double secondDouble = 45.62;
        // Calling overloaded method calculateSum using two doubles
        System.out.printf("Doubles: The sum of %.2f and %.2f is %.2f\n", firstDouble, secondDouble,
                calculateSum(firstDouble, secondDouble));
    }

    // Calculate and return the sum of two integers.
    public static int calculateSum(int a, int b) {
        return a + b;
    }

    // Calculate and return the sum of two doubles.
    public static double calculateSum(double a, double b) {
        return a + b;
    }
}