package inheritance;

// The Person class serves as the base (superclass) for demonstrating inheritance.
// It defines common properties that can be inherited by other classes.
public class Person {
    private String name;
    private int age;
    private double height;

    // Constructor to initialize a Person object with name, age, and height.
    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // Getter and setter methods for each property.
    // These methods allow derived classes to access and modify the inherited
    // properties.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
