package day18_opps.abstracts;

abstract class Car{
    String name="Car";
    public abstract void increseSpeed();
    public abstract void drive();
    public void horn(){
        System.out.println("pee.. pee.. pee.........");
    }
   
}
class wagnor extends Car {
    public void increseSpeed(){
        System.out.println("incresing speed...");
    }
    public  void drive(){
        System.out.println("wagnor driving....");
    }
    class wagnor2{
        public void superBreak(){
            System.out.println("stop........ duaa duaa ho gaya...😂😂😂");
        }
    }
    
}

public class Abstractfile {
    public static void main(String[] args) {
        Car obj1=new wagnor();
        obj1.drive();
        obj1.horn();
        obj1.increseSpeed();
    }
}


// In Java, **abstract** is a keyword used to define classes and methods that are incomplete and meant to be extended or implemented by subclasses. It is part of Java's object-oriented programming approach, enabling abstraction and code reusability.

// ### Abstract Classes
// - **Definition**: A class declared with the `abstract` keyword is an abstract class.
// - **Purpose**: Serves as a blueprint for other classes. You cannot instantiate an abstract class directly.
// - **Features**:
//   - Can have both abstract methods (methods without a body) and concrete methods (methods with a body).
//   - Can include fields, constructors, and static methods like a regular class.
  
// Example:
// ```java
// abstract class Animal {
//     // Abstract method (no body)
//     abstract void sound();

//     // Concrete method
//     void eat() {
//         System.out.println("This animal eats food.");
//     }
// }
// ```

// ### Abstract Methods
// - **Definition**: A method declared with the `abstract` keyword does not have a body (implementation) and must be implemented by a subclass.
// - **Rules**:
//   - Can only exist in an abstract class.
//   - Subclasses must override all abstract methods unless they are also abstract.
  
// Example:
// ```java
// class Dog extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Woof Woof");
//     }
// }
// ```

// ### Key Points
// 1. Abstract classes are ideal for situations where some behavior should be shared, but specific details vary across subclasses.
// 2. A class that extends an abstract class must provide implementations for all its abstract methods unless it is also declared abstract.
// 3. Abstract classes are different from interfaces; abstract classes can have state (fields), while interfaces are meant only for defining behaviors (before Java 8). 

// Using abstraction in Java improves modularity and ensures that subclasses follow a defined structure.