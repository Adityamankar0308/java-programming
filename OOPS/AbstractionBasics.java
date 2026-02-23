// Abstract class
abstract class Shape {

    // Abstract method
    abstract double area();

    // Normal method
    void display() {
        System.out.println("Calculating Area");
    }
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

// Main class
public class AbstractionBasics {

    public static void main(String[] args) {

        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);

        c.display();
        System.out.println("Circle Area: " + c.area());

        r.display();
        System.out.println("Rectangle Area: " + r.area());
    }
}