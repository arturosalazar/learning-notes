package arrayfeatures;

import java.util.Arrays;

// Demonstrates how to create, initialize, and print an array of strings in Java.
public class ArrayCreation {
    public static void main(String[] args) {
        // Create a 6 item array to hold Strings
        String[] programmingLanguages = new String[6];
        programmingLanguages[0] = "Java";
        programmingLanguages[1] = "Python";
        programmingLanguages[2] = "C";
        programmingLanguages[3] = "C++";
        programmingLanguages[4] = "JavaScript";
        programmingLanguages[5] = "TypeScript";

        // Alternative array initialization in a single line:
        // String[] programmingLanguages = {"Java", "Python", "C", "C++", "JavaScript",
        // "TypeScript"};

        // Printing the array directly would not show its contents properly.
        // Arrays.toString() is used to print a readable representation of the array.
        System.out.println(Arrays.toString(programmingLanguages));

    }
}
