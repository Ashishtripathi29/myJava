package day18_opps;
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class OverRiding {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Upcasting
        animal.sound(); // Output: Dog barks
        
    }
}

// Overriding in Java: A Brief Introduction
// Overriding in Java is a feature that allows a subclass to provide a specific implementation for a method that is already defined in its superclass. It is a way to achieve runtime polymorphism and dynamic method dispatch in object-oriented programming.

// Key Characteristics of Method Overriding:
// Same Method Signature:

// The method in the subclass must have the same name, return type, and parameters as the method in the superclass.
// Inheritance:

// The overriding method must belong to a subclass, and the method being overridden must be defined in a superclass.
// Annotations:

// The @Override annotation is optional but recommended. It ensures that the method is correctly overriding a superclass method.
// Access Modifiers:

// The overriding method cannot have a more restrictive access modifier than the overridden method.
// Example: If the superclass method is protected, the overriding method cannot be private.
// Final, Static, and Private Methods:

// Final methods cannot be overridden.
// Static methods are not overridden; they are hidden if redefined in the subclass.
// Private methods are not accessible to subclasses and thus cannot be overridden.
// Return Types:

// The return type of the overriding method must be the same as, or a subtype (in case of covariant return types), of the return type of the overridden method.
// Exceptions:

// The overriding method cannot throw broader exceptions than the overridden method.
// Example of Method Overriding:
// // Superclass
// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// // Subclass
// class Dog extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// // Main Class
// public class Main {
//     public static void main(String[] args) {
//         Animal animal = new Dog(); // Upcasting
//         animal.sound(); // Output: Dog barks
//     }
// }
// Advantages of Overriding:
// Flexibility: Allows specific behavior for a subclass while maintaining a common interface.
// Polymorphism: Enables runtime method invocation based on the object type.
// Reusability: Encourages code reuse by extending and modifying behavior without altering the original class.
