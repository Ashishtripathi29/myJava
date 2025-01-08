package day18_opps.abstracts;
// In Java, an interface is a blueprint for a class that defines a collection of abstract methods and constants, used to achieve abstraction and multiple inheritance by specifying a contract that implementing classes must follow.


interface Animal {
    void sound();
    void leg();
    default void types(){
        System.out.println("palatu...");
    }
} 
interface Animal2{
    void eat();
}
class Dog implements Animal,Animal2{
    public void sound(){
        System.out.println("woof!..");
    }
    public void leg(){
        System.out.println("running with 4 legs");
    }
    public void eat(){
        System.out.println("Eating...");
    }
}


public class InterF {
    public static void main(String[] args) {
        Animal myDog=new Dog();
        myDog.sound();
        myDog.leg();
        myDog.types();
        Animal2 myDog2=new Dog();
        myDog2.eat();
        Dog myDog3=new Dog();
        myDog3.eat();
        myDog3.sound();
        myDog3.leg();
        myDog3.types();
    }
}
