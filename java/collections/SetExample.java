package collections;

import java.util.Set; // import Set interface
import java.util.HashSet; // import HashSet - implentation of Set interface

public class SetExample {
    public static void main(String[] args) {
        // Create variable with data type of interface
        // Assign it value of new HashSet
        Set<String> fruits = new HashSet<String>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("pear");
        fruits.add("apple");

        System.out.println(fruits);

    }

}
