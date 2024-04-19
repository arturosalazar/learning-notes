package stringmanipulation;
// Demonstrates a variety of ways to iterate over a String in Java

import java.util.PrimitiveIterator;

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
        System.out.println();

        // Using a standard 'while' loop with charAt():
        // Pro: Straightforward, allows you to keep track of index
        // Con: Lots of boilerplate code to provide, need to create index variable
        // and remember to keep iterating index
        int i = 0;
        while (i < example.length()) {
            System.out.print(example.charAt(i));
            i++;
        }
        System.out.println();

        // Using a 'for-each' loop with toCharArray():
        // Pro: Less verbose, clearer to see what is happening
        // Con: Requires that you turn the String into a character array with
        // toCharArray() first
        for (char c : example.toCharArray()) {
            System.out.print(c);
        }
        System.out.println();

        // Using Java 8 Streams with chars() and forEach methods:
        // Pro: Very succinct
        // Con: Each character is turned into a corresponding ASCII integer value, so
        // needs to be cast to print as char
        // Cannot use unicode characters
        example.chars().forEach(c -> {
            System.out.print((char) c);
        });
        System.out.println();

        // Using Java 8 Streams with codePoints() method
        // Pro: Very succinct and can use unicode characters
        // Con: Every code is turned into a corresponding UNICODE integer
        // Need to convert codePoints into character to process as char
        example.codePoints().forEach(codePoint -> {
            System.out.print((char) codePoint);
        });
        System.out.println();

        // Using an 'Iterator' with chars() or codePoints() Stream:
        // Convert character stream into an Iterator for more controlled iteration
        // such as removing elements during iteration etc
        // Pro: Controlled iteration, useful for modifiable iteration
        // Con: Adds complexity with manual type conversions
        PrimitiveIterator.OfInt it = example.chars().iterator();
        while (it.hasNext()) {
            System.out.print((char) it.nextInt()); // Use nextInt() to get int value that can be cast to a char directly
            // Using .next() will return an Integer object that cannot be directly cast and
            // will yield error
        }
        System.out.println();
    }
}
