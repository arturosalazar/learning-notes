package workingwithobjects.objectconstructor;

// A test class to demonstrate the functionality of the Rectangle class constructor
// This class creates a Rectangle object and sets its dimensions at the same time
// Then checks if the values were set as expected.
public class RectangleTester {
    public static void main(String[] args) {
        // Create a new Rectangle object.
        Rectangle rectangle = new Rectangle(5.0, 4.0);

        System.out.println("Rectangle length set to 5.0? " + (rectangle.getLength() == 5.0));

        System.out.println("Rectangle width set to 4.0? " + (rectangle.getWidth() == 4.0));

        System.out.println("Rectangle perimeter = 18.0? " + (rectangle.calculatePerimeter() == 18.0));

        System.out.println("Rectangle area = 20.0? " + (rectangle.calculateArea() == 20.0));
    }
}
