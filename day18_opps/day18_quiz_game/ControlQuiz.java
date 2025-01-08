package day18_opps.day18_quiz_game;

import java.util.Scanner;

public class ControlQuiz {

   QuizPort[] myQuizPorts = new QuizPort[10];

   private void addingQuiz() {
      myQuizPorts[0] = new QuizPort(1, "What is the size of an int in Java?", "2 bytes", "4 bytes", "8 bytes",
            "Depends on the platform", "4 bytes");
      myQuizPorts[1] = new QuizPort(2, "Which of the following is not a Java keyword?", "static", "volatile",
            "interface", "publicly", "publicly");
      myQuizPorts[2] = new QuizPort(3, "What is the purpose of the final keyword in Java?", "To make a class abstract",
            "To restrict inheritance, method overriding, or variable reassignment",
            "To declare a variable without initialization", "To define a method in an interface",
            "To restrict inheritance, method overriding, or variable reassignment");
      myQuizPorts[3] = new QuizPort(4, "Which method is called when an object is created in Java?", "finalize()",
            "main()", "Constructor", "init()", "Constructor");
      myQuizPorts[4] = new QuizPort(5, "Which of the following is not a feature of Java?", "Platform independence",
            "Object-oriented", "Memory pointers", "Automatic garbage collection", "Memory pointers");
      myQuizPorts[5] = new QuizPort(6, "Which of these is a valid declaration of a main() method in Java?",
            "public static void main(String args[])", "public void main(String[] args)",
            "static public void main(String[] args)", "Both A and C", "Both A and C");
      myQuizPorts[6] = new QuizPort(7, "What does the java command do?", "Compiles Java source code",
            "Runs Java bytecode", "Both A and B", "Deletes Java files", "Runs Java bytecode");
      myQuizPorts[7] = new QuizPort(8, "Which exception is thrown when dividing by zero in Java?",
            "ArithmeticException", "NullPointerException", "NumberFormatException", "IllegalArgumentException",
            "ArithmeticException");
      myQuizPorts[8] = new QuizPort(9, "What is the default value of a boolean variable in Java?", "true", "false",
            "null", "No default value", "false");
      myQuizPorts[9] = new QuizPort(10, "Which of the following can be overloaded in Java?", "Constructors", "Methods",
            "Operators", "Both A and B", "Both A and B");
      // myQuizPorts[10] = new QuizPort(11, "Which data type is used to store a single character in Java?", "String",
      //       "char", "Character", "boolean", "char");
      // myQuizPorts[11] = new QuizPort(12, "What will happen if you try to access an array index out of bounds?",
      //       "Compilation error", "ArrayIndexOutOfBoundsException", "NullPointerException",
      //       "No exception, it assigns a default value", "ArrayIndexOutOfBoundsException");

   }

   public void play() {
      addingQuiz();
      Scanner sc = new Scanner(System.in);
      int score = 0;
      for (QuizPort q : myQuizPorts) {
         String st = q.toString();
         System.out.print(st);
         
         String ans="";
         try {
          int a=0;
           while(a<=0 || a>4){
            System.out.print("please enter answer: ");
            ans = sc.nextLine();
             a=Integer.parseInt(ans);
           }
           
         } catch (Exception e) {
            ans="1";
         }
         String newSt=ans + ".";
         String myst = st.split(java.util.regex.Pattern.quote(newSt))[1].split("\n")[0];
         System.out.println(myst);
         System.out.println();
         if(q.getAns().equals(myst)){
            score++;
         }
      }
      sc.close();
      System.out.println("Your score is:"+ score);

   }

}
