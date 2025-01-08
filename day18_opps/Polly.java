package day18_opps;
class Animal {
    protected void sound() {
        System.out.println("Animal sounding...");
    }
}

class Dog extends Animal {

    protected void sound() {
        System.out.println("Dog barking");
    }
}

public class Polly {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // creating object
        myAnimal.sound();
        Dog myAnimal1 = (Dog) myAnimal; // down casting
        myAnimal1.sound();
        Animal myAnimal2 = (Animal) myAnimal; // up casting(it's default casting)
        myAnimal2.sound();

    }
}

// Polymorphism (Brief Introduction)
// Polymorphism is a key concept in object-oriented programming (OOP) that
// allows objects of different classes to be treated as objects of a common
// superclass. It enables a single interface to represent different underlying
// forms (data types or classes). The term comes from the Greek words "poly"
// (many) and "morph" (forms), meaning "many forms."

// Types of Polymorphism
// Compile-Time Polymorphism (Static)
// Achieved using:

// Method Overloading: Defining multiple methods with the same name but
// different parameters.
// Operator Overloading: Redefining operators to perform different tasks based
// on operand types.
// Run-Time Polymorphism (Dynamic)
// Achieved using:

// Method Overriding: Redefining a method in a subclass that is already defined
// in its superclass.
// Requires a pointer or reference to the base class to call overridden methods
// dynamically.
// Benefits of Polymorphism
// Promotes code reusability and extensibility.
// Makes code more flexible and scalable by decoupling objects from their
// specific implementations.
// Example
// Method Overriding:

// java
// Copy code
// class Animal {
// void sound() {
// System.out.println("Animal makes a sound");
// }
// }

// class Dog extends Animal {
// @Override
// void sound() {
// System.out.println("Dog barks");
// }
// }

// public class Main {
// public static void main(String[] args) {
// Animal myAnimal = new Dog(); // Polymorphism
// myAnimal.sound(); // Output: Dog barks
// }
// }
// This example demonstrates runtime polymorphism where the method sound() is
// dynamically resolved at runtime.