package day2;

import java.util.Scanner;

class main {
    public static void main(String[] args) {
        System.out.println("from here I am going to start litterl");
        System.out.println("=====================================================");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the byte");
        byte bit=sc.nextByte();
        System.out.println("the byte value is :"+bit);
        System.out.println("Now enter the value for char");
        char charD=sc.next().charAt(0);
        System.out.println(charD);
        System.out.println("Now enter the value for short");
        short myShort=sc.nextShort();
        System.out.println("the value of my short is :"+ myShort);
        System.out.println("now enter the value of int");
        int num=sc.nextInt();
        System.out.println("the interger is :"+num);
        System.out.println("now enter the value of float");
        float floatNum=sc.nextFloat();
        System.out.println("the float num is :"+floatNum);
        System.out.println("now enter the value of double");
        double doubnum=sc.nextDouble();
        System.out.println("the  double interger is :"+doubnum);
        System.out.println("now enter the value of long int");
        long longInt=sc.nextLong();
        System.out.println("the  longint is :"+longInt);
        sc.nextLine();
        System.out.println("now enter the value of string");
        String myString =sc.nextLine();
        System.out.println("the  string is :"+myString);
        System.out.println("now enter the value of boolean");
        Boolean myBoolean =sc.nextBoolean();
        System.out.println("the  boolean value  is :"+myBoolean);

    }
}


//========================================= example 3 ========================================
// import java.util.*;  
// public class main {    
//     public static void main(String[] args) {  
//         String str = "JavaTpoint.com 13 + 13 = 26.0 false";  
//           Scanner scan = new Scanner(str);  
//           while (scan.hasNext()) {  
//              //If the next is byte, print found and the byte  
//              if (scan.hasNextByte()) {  
//                 System.out.println("Found :" + scan.nextByte());  
//              }  
//              System.out.println("Not Found :" + scan.next());  
//           }  
//           scan.close();  
//           }  
// }  