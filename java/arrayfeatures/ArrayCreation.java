package arrayfeatures;

import java.util.Arrays;

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

        // To print an array as a whole, you need Arrays.toString()
        // Import java.util.Arrays to do so
        System.out.println(Arrays.toString(programmingLanguages));

    }
}
