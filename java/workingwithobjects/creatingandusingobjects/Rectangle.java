package workingwithobjects.creatingandusingobjects;
// Rectangle class with private fields, public getter/setters and other methods

// This is the bare bones example on how to create an Object that will be 
// Used elsewhere.
// There is no explicit constructor

// Class Declaration
public class Rectangle {
    // private fields - important for encapsulation
    private double length;
    private double width;

    // Getters and Setters - note they are public
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

    // Additional public methods
    public double calculatePerimiter() {
        return (2 * length) + (2 * width);
    }

    public double calculateArea() {
        return length * width;
    }
}
