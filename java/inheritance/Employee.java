package inheritance;

// The Employee class demonstrates simple inheritance by extending the Person class.
// It inherits properties from Person and adds job-specific properties like title and employeeID.
public class Employee extends Person {
    private String title;
    private int employeeID;

    // Constructor that includes parameters for both the inherited fields and the new fields.
    // Calls the super constructor to set inherited fields (name, age, height).
    public Employee(String name, int age, double height, String title, int employeeID) {
        super(name, age, height); // Passes common attributes to the superclass constructor.
        this.title = title; // Specific attribute to Employee.
        this.employeeID = employeeID; // Specific attribute to Employee.
    }

    // Additional getter and setter methods for the new properties specific to the Employee class.
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
}
