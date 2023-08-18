package day9_else_if_and_switch;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            System.out.println("please enter your age to check what you can do :");
            int age = sc.nextInt();
            sc.nextLine();
            if (age >= 60)
                System.out.println("enjoy life and wait for visit bhagawan");
            else if (age >= 35)
                System.out.println("you can became PM");
            else if (age >= 25)
                System.out.println("you can become CM");
            else if (age >= 21)
                System.out.println("you can become DM");
            else if (age >= 18)
                System.out.println("you can vote and become pradhan");
            else if (age >= 16)
                System.out.println("you can fill form in NDA");
            else
                System.out.println("you are child you can study or play game");
           
        
            System.out.println("enter your favorite game:");
       
            String gameName = sc.nextLine();

            switch (gameName) {
                case "cricket":
                    System.out.println("well! i got it , your favorite game is cricket");
                    break;
                case "hockey":
                    System.out.println("well! i got it , your favorite game is hockey");
                    break;
                case "kabaddi":
                    System.out.println("well! i got it , your favorite game is kabaddi");
                    break;
                case "kusti":
                    System.out.println("well! i got it , your favorite game is kusti");
                    break;
                case "WWE":
                    System.out.println("well! i got it , your favorite game is WWE");
                    break;
                case "running":
                    System.out.println("well! i got it , your favorite game is running");
                    break;
                default:
                    System.out.println("sorry I didn't gate game for you try another game name");

            }
        

    }
}
