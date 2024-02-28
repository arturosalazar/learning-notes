// Demonstrates variable scope in Java, highlighting the accessibility of variables based on where they are defined.
public class VariableScope {
    // Static variable with class scope, accessible from anywhere within the class.
    static String outer = "Outer: Global Scope";

    public static void main(String[] args) {
        System.out.println("Inside main: can access the static variable: " + outer);

        // Local variable to main method.
        String inMain = "inMain: Local to main";
        System.out.println("Inside main: can access 'inMain': " + inMain);
    }
}
