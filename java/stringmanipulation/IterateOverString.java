package stringmanipulation;
// Demonstrates how to iterate over a String in Java 

public class IterateOverString {
    public static void main(String[] args) {
        // Loop over string with a for loop
        String example = "This is some example text";
        for (int i = 0; i < example.length(); i++) {
            System.out.println(example.charAt(i));
        }
    }
}
