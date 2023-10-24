package day15_constructor;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class Book {
    private String name;
    private int price;

    // this is constructor ,it will call when object is created and constructor can
    // be overloaded
    public Book() {
        System.out.println("this is default constructor");
    }

    public Book(int p) {
        price = p;
    }

}

/*
 * 
 * Create a class Game, which allows a user to play "Guess the Number" game
 * once.
 * 
 * Game should have the following methods:
 * Constructor to generate the random number
 * takeUserInput() to take a user input of number
 * isCorrectNumber() to detect whether the number entered by the user is true
 * getter and setter for noOfGuesses
 * Use properties such as noOfGuesses(int), etc to get this task done!
 * 
 */

class game {
    int n;
    int noOfGuesses = 1;

    public game() {
        n = ThreadLocalRandom.current().nextInt(100);
    }

    public boolean takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please Enter your Number : ");
        int num = sc.nextInt();
        System.out.println("you have tried : " + noOfGuesses++);
        if (num == n) {
            System.out.println("you got the right number");
            System.out.println("your number is " + num);
            System.out.println("computer number is " + n);
            return true;
        } else if (num > n) {
            System.out.println("your number is greater the computer number");
            return false;
        } else {
            System.out.println("your number is smaller then computer number");
            return false;
        }

    }

}

public class main {
    public static void main(String[] args) {
        Book ourBook = new Book();
        Book yourBook = new Book(56);

        game myGame = new game();
        boolean play = false;
        while (play == false) {
            play = myGame.takeUserInput();
        }

    }
}
