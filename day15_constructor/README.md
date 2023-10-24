Constructors in Java : 
Constructors are similar to methods,, but they are used to initialize an object.
Constructors do not have any return type(not even void).
Every time we create an object by using the new() keyword, a constructor is called.
If we do not create a constructor by ourself, then the default constructor(created by Java compiler) is called.
Rules for creating a Constructor :
The class name and constructor name should be the same.
It must have no explicit return type.
It can not be abstract, static, final, and synchronized.
Types of Constructors in Java :
There are two types of constructors in Java :

Defaut constructor : A constructor with 0 parameters is known as default constructor.
Syntax :
<class_name>(){
//code to be executed on the execution of the constructor
}  

example :
class CWH {
    CWH(){
        System.out.println("This is the default constructor of CWH class.");
    }

}
public class CWH_constructors {
    public static void main(String[] args) {
        CWH obj1 = new CWH();

    }
}
output:
This is the default constructor of CWH class.
In the above code, CWH() is the constructor of class CWH The CWH() constructor is invoked automatically with the creation of object ob1.

Paramerterized constructor : A constructor with some specified number of parameters is known as a parameterized constructor.
Syntax :
<class-name>(<data-type> param1, <data-type> param2,......){
//code to be executed on the invocation of the constructor
}
example:
class CWH {
    CWH(String s, int b){

        System.out.println("This is the " +b+ "th video of "+ " "+ s);
    }

}
public class CWH_constructors {
    public static void main(String[] args) {
        CWH obj1 = new CWH("CodeWithHarry Java Playlist",42);

    }
}
output:
This is the 42th video of  CodeWithHarry Java Playlist
In the above example, CWH() constructor accepts two parameters i.e., string s and int b.

Constructor Overloading in Java :
Just like methods, constructors can also be overloaded in Java. We can overload the Employe constructor like below: 
public Employee (String n)
           name = n;
         }
         Note:

 Constructors can take parameters without being overloaded 
There can be more than two overloaded constructors 
Let's take an example to understand the concept of constructor overloading. 

Example :
In the below example, the class Employee has a constructor named Employee(). It takes two argument,i.e., string s & int i. The same constructor is overloaded and then it accepts three arguments i.e., string s, int i & int salary
class Employee {
// First constructor
    Employee(String s, int i){
        System.out.println("The name of the first employee is : " + s);
        System.out.println("The id of the first employee is : " + i);
    }
//    Constructor overloaded
    Employee(String s, int i, int salary){
        System.out.println("The name of the second employee is : " + s);
        System.out.println("The id of the second employee is : " + i);
        System.out.println("The salary of second employee is : " + salary);
    }

}
public class CWH_constructors {
    public static void main(String[] args) {
        Employee shubham = new Employee("Shubham",1);
        Employee harry = new Employee("Harry",2,70000);



    }
}
output:
The name of the first employee is : Shubham
The id of the first employee is : 1
The name of the second employee is : Harry
The id of the second employee is : 2
The salary of second employee is : 70000


Quick quiz: Overloaded the employee constructor to initialize the salary to Rs 10,000

Source code as described in the video:
package com.company;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 0;
        name = "Your-Name-Here";
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){
        id = 1;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class cwh_42_constructors {
    public static void main(String[] args) {
        //MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry", 12);
        MyMainEmployee harry = new MyMainEmployee();
        //harry.setName("CodeWithHarry");
        //harry.setId(34);
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}
