package workingwithobjects.creatingandusingobjects;

// A test class to demonstrate the functionality of the Rectangle class.
// This class creates a Rectangle object, sets its dimensions, and checks if the methods work as expected.
public class RectangleTester {
    public static void main(String[] args) {
        // Create a new Rectangle object.
        Rectangle rectangle = new Rectangle();
        
        // Set the length of the rectangle to 5.0 and verify that the length is set correctly.
        rectangle.setLength(5.0);
        System.out.println("Rectangle length set to 5.0? " + (rectangle.getLength() == 5.0));
        
        // Set the width of the rectangle to 4.0 and verify that the width is set correctly.
        rectangle.setWidth(4.0);
        System.out.println("Rectangle width set to 4.0? " + (rectangle.getWidth() == 4.0));
        
        // Calculate and verify the perimeter of the rectangle.
        System.out.println("Rectangle perimeter = 18.0? " + (rectangle.calculatePerimeter() == 18.0));
        
        // Calculate and verify the area of the rectangle.
        System.out.println("Rectangle area = 20.0? " + (rectangle.calculateArea() == 20.0));
    }
}
