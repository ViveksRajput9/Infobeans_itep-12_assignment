package oops.Inhertance;
 // Base class for Single Inheritance
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

// Single Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Multilevel Inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// Interfaces for Hybrid Inheritance
interface CanRun {
    void run();
}

interface CanBark {
    void bark();
}

// Hybrid Inheritance
class Greyhound extends Dog implements CanRun {
    @Override
    public void run() {
        System.out.println("Greyhound runs fast");
    }
}

// Main class to test the inheritance
public class InheritanceExample {
    public static void main(String[] args) {
        // Single Inheritance
        Dog dog = new Dog();
        dog.eat(); // Inherited from Animal
        dog.bark(); // Method from Dog

        // Multilevel Inheritance
        Puppy puppy = new Puppy();
        puppy.eat(); // Inherited from Animal
        puppy.bark(); // Inherited from Dog
        puppy.weep(); // Method from Puppy

        // Hierarchical Inheritance
        Cat cat = new Cat();
        cat.eat(); // Inherited from Animal
        cat.meow(); // Method from Cat

        // Hybrid Inheritance
        Greyhound greyhound = new Greyhound();
        greyhound.eat(); // Inherited from Animal
        greyhound.bark(); // Inherited from Dog
        greyhound.run(); // Implemented from CanRun
    }
}