package day8_logical_relational_operator;


public class main {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;

        if(a==b){
            System.out.println("a is equel to b");
        }
        if(a!=b){
            System.out.println("a is not equel to b");
        }
        
        int c=34;
        int d=34;
        if(c>d){
            System.out.println("c is greater then d");
        }
        if(c<d){
            System.out.println("c is less then d");
        }
        if(c>=d){
            System.out.println("c is greater then or equel to d");
        }
        if(c<=d){
            System.out.println("c is less then or equel to d");
        }


        if(a && b){
            System.out.println("a is true and b is also true");
        }
        if(a || b){
            System.out.println("a is true ya fir b is a true");
        }

    }
}
