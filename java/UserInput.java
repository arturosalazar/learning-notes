// How to get user input from a user using Java

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's write a story!");

        System.out.println("Please provide me with an adjective");
        String adjective = scanner.next();

        System.out.println("Please provide me with a season");
        String season = scanner.next();

        System.out.println("Please provide me with a whole number");
        int number = scanner.nextInt();

        String resultPhrase = "On a " + adjective + " " + season
                + " day, I drink a minimum of " + number + " cups of coffee.";

        System.out.println(resultPhrase);

        scanner.close();
    }
}