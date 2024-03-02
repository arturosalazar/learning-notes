package inheritance;

// The InheritanceChecker class is used to demonstrate the usage of inheritance.
// It creates instances of Person and Employee to show how properties and methods are inherited and extended.
public class InheritanceChecker {
    public static void main(String[] args) {
        // Creating an instance of Person and displaying its properties.
        Person person = new Person();
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getHeight());

        // Creating an instance of Employee, which inherits properties from Person,
        // and also has its own properties. Demonstrates how an Employee is a Person but
        // with additional characteristics.
        Employee employee = new Employee("Juan", 28, 84, "Programmer", 123456);
        System.out.println(employee.getName()); // Inherited property
        System.out.println(employee.getAge()); // Inherited property
        System.out.println(employee.getHeight()); // Inherited property
        System.out.println(employee.getTitle()); // Employee-specific property
        System.out.println(employee.getEmployeeID()); // Employee-specific property
    }
}
