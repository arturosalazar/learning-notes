package stringmanipulation;
// Demonstrates a variety of ways to iterate over a String in Java

// Simply printing the character will be used to demo processing the character, but any other way to process can be used
// When applicable, reasons behind using one way over another way to iterate will be explained

public class IterateOverStrings {

    public static void main(String[] args) {
        String example = "This is some example text";

        // Using a standard 'for' loop with charAt():
        // Pro: Straightforward, allows you to keep track of index
        // Con: Lots of boilerplate code to provide
        for (int i = 0; i < example.length(); i++) {
            System.out.println(example.charAt(i));
        }
    }
}
