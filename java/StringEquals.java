// Demonstrates the correct way to compare String variables in Java.
// This program also illustrates why using 'new String()' creates distinct objects
// and how string interning can make '==' appear to work in some cases,
// but why it should not be relied upon for string content comparison.

public class StringEquals {
    public static void main(String[] args) {
        System.out.println("How to compare two strings\n");

        // Demonstrates using .equals() for comparing string contents.
        // Using 'new String()' to explicitly create separate String objects
        // to emphasize that even identical string contents do not share the same memory
        // location
        // when created in this manner.
        String first = new String("I love Java");
        String second = new String("I love Java");
        System.out.println("Created two String variables with new String(\"I love java\")");
        System.out.println("First: " + first);
        System.out.println("Second: " + second); // Corrected to show 'second' instead of 'first'
        System.out.println("first.equals(second): " + first.equals(second) + "\n");

        // Demonstrates the incorrect way to compare strings using '=='
        // This compares the reference (memory location) of the string objects, not
        // their contents.
        // '==' comparison is misleading because it checks object identity,
        // which does not guarantee content equality, especially for objects created
        // with 'new String()'.
        System.out.println("Wrong way: use ==");
        System.out.println(
                "This will compare the memory location of each string object, NOT the contents of the objects.");
        System.out.println("first == first: " + (first == first)); // This will always be true because it compares the
                                                                   // same object reference.
        System.out.println("first == second: " + (first == second)); // Corrected to compare 'first' with 'second' to
                                                                     // demonstrate the point.

        /**
         * Additional note on string interning:
         * String literals are interned,
         * Java maintains a string pool to store unique string literals.
         * When you create a string literal (e.g., String first = "I love Java";),
         * Java checks the pool for a string with the same contents.
         * If found, it returns a reference to the pooled instance.
         * If not found, it adds the new string to the pool and returns a
         * reference to this new instance.
         * Therefore, all string literals with the same content will point to
         * the same memory location in the pool, making == comparison true.
         * This should not be relied on as it only works in special cases, and
         * does not work when using new String() or when a string is derived
         * from methods like substring or concatenating with variables
         * 
         */
    }
}
