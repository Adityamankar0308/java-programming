// Abstraction
abstract class Employee {

    // Encapsulation (private variables)
    private String name;
    private int id;

    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getters (Encapsulation)
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Abstract method (Abstraction)
    abstract double calculateSalary();

    // Concrete method
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

// Inheritance
class FullTimeEmployee extends Employee {

    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    // Polymorphism (Method Overriding)
    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Polymorphism (Method Overriding)
    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

// Main Class
public class Concept {

    public static void main(String[] args) {

        // Runtime Polymorphism
        Employee emp1 = new FullTimeEmployee("Aditya", 101, 50000);
        Employee emp2 = new PartTimeEmployee("Rahul", 102, 80, 500);

        emp1.displayInfo();
        System.out.println("Salary: " + emp1.calculateSalary());

        System.out.println();

        emp2.displayInfo();
        System.out.println("Salary: " + emp2.calculateSalary());
    }
}
