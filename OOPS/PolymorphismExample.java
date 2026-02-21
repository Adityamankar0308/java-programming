import java.util.*;
// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat says Meow");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal a = new Cat();  // Upcasting
        a.sound();             // Calls Cat's method
    }
}