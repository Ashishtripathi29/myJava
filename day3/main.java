package day3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("*** wow!! this apllication for calculate the percentage to given marks ***");
        System.out.println("==================================================================\n");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of Hindi");
        byte hindi=sc.nextByte();
        System.out.println("Enter the marks of Math");
        byte math =sc.nextByte();
        System.out.println("Enter the marks of Physics");
        byte physics =sc.nextByte();
        System.out.println("Enter the marks of Chemistry");
        byte chemistry =sc.nextByte();
        System.out.println("Enter the marks of English");
        byte english =sc.nextByte();
        sc.close();

        float percentage=(hindi+math+physics+chemistry+english)/5;
        System.out.println("the percentage of the your is :"+ percentage);
    }
}
