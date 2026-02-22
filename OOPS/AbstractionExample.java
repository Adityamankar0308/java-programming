// Abstract class
abstract class Vehicle {

    // Abstract method (no body)
    abstract void start();

    // Normal method
    void fuelType() {
        System.out.println("Vehicles use different types of fuel.");
    }
}

// Child class 1
class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with a key or button.");
    }
}

// Child class 2
class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with a kick or self-start button.");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {

        Vehicle car = new Car();
        car.start();
        car.fuelType();

        System.out.println();

        Vehicle bike = new Bike();
        bike.start();
        bike.fuelType();
    }
}