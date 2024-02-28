//Demonstrate the use of variable arguments in a method declaration
public class VariableArguments {
    public static void main(String[] args) {
        // Demonstrates calling calculateSum with a varying number of integer arguments.
        System.out.println(calculateSum()); // No arguments passed.
        System.out.println(calculateSum(2, 4)); // Two arguments passed.
        System.out.println(calculateSum(2, 4, 5, 7)); // Four arguments passed.

        // Demonstrates calling calculateSum with an array.
        // This highlights that varargs methods can also accept an array of the
        // specified type.
        System.out.println(calculateSum(new int[] { 2, 4, 5, 7 }));
    }

    /**
     * Calculates the sum of an arbitrary number of integer arguments.
     * Varargs (variable number of arguments) are used here to allow the method to
     * accept
     * zero or more arguments of type int. Inside the method, the varargs are
     * treated as an array.
     * 
     * @param values The integers to sum. This parameter uses varargs to accept any
     *               number of int values.
     * @return The sum of the provided values.
     */
    public static int calculateSum(int... values) {
        int sum = 0;
        // Iterate through each value in the varargs array to calculate the sum.
        for (int value : values) {
            sum += value;
        }
        return sum;
    }
}
