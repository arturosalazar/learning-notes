package workingwithobjects.objectconstructor;
// Demonstrates how to create and use a Rectangle class with an explicit constructor.

public class Rectangle {

    private double length;
    private double width;

    // Constructor - note that it looks like a method, but with no return data type
    // and using the name of the Class
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    public double calculateArea() {
        return length * width;
    }
}
