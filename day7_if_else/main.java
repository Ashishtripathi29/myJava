package day7_if_else;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int age=10;
        // boolean cond=age!=10;
        // if(cond){
        //     System.out.println("you can't cry");
        // }
        // else{
        //     System.out.println("you can ");
        // }
        System.out.println("please enter the your age for cheaking for voting: ");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("you can vote");
        }
        else{
            int remAge=18-age;
            System.out.println("you can wait "+remAge+" year for voting");
        }
    }
}
