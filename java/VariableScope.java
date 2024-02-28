// Demonstrates variable scope in Java, highlighting the accessibility of variables based on where they are defined.
public class VariableScope {
    // Static variable with class scope, accessible from anywhere within the class.
    static String outer = "Outer: Global Scope";

    public static void main(String[] args) {
        System.out.println("Inside main: can access the static variable: " + outer);

        // Local variable to main method.
        String inMain = "inMain: Local to main";
        System.out.println("Inside main: can access 'inMain': " + inMain);

        // Calling other methods within the class.
        method1();
        method2();
    }

    public static void method1() {
        // Accessible due to class scope.
        System.out.println("Inside method1: can access the static variable: " + outer);

        // inMain is not accessible here; it's local to main.
        String inMethod1 = "inMethod1: Local to method1";
        System.out.println("Inside method1: can access 'inMethod1': " + inMethod1);
    }

    public static void method2() {
        // Accessible due to class scope.
        System.out.println("Inside method2: can access the static variable: " + outer);

        // Local variable to method2.
        String inMethod2 = "inMethod2: Local to method2";
        System.out.println("Inside method2: can access 'inMethod2': " + inMethod2);

        // Demonstrating scope within block statements.
        if (true) {
            String inIfStatement = "inIfStatement: Local to this if block";
            System.out.println("Inside if block in method2: can access 'inIfStatement': " + inIfStatement);
            // inIfStatement is accessible only within this if block.
        }
        // Here, inIfStatement is not accessible because its scope is limited to the if
        // block above.
    }
}
