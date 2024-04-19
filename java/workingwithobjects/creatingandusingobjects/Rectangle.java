package workingwithobjects.creatingandusingobjects;
// Demonstrates how to create and use a Rectangle class without an explicit constructor.

// This example emphasizes the importance of encapsulation through private fields and public getters/setters.
// This is the bare bones example on how to create an Object that will be used elsewhere

// Class Declaration
public class Rectangle {
    // Private fields to prevent direct access from outside the class, enhancing
    // encapsulation.
    private double length;
    private double width;

    // Public getter for the length field.
    // Returns the value of length.
    public double getLength() {
        return this.length;
    }

    // Public getter for the width field.
    // Returns the value of width.
    public double getWidth() {
        return this.width;
    }

    // Public setter for the length field.
    // Sets the value of length to the provided value.
    public void setLength(double length) {
        this.length = length;
    }

    // Public setter for the width field.
    // Sets the value of width to the provided value.
    public void setWidth(double width) {
        this.width = width;
    }

    // Calculates and returns the perimeter of the rectangle.
    public double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    // Calculates and returns the area of the rectangle.
    public double calculateArea() {
        return length * width;
    }
}
