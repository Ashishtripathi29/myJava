package day15_constructor;

class Book{
    private String name;
   private  int price;
//this is constructor ,it will call when object is created and constructor can be overloaded 
    public Book(){
        System.out.println("this is default constructor");
    }
    public Book(int p){
        price=p;
    }
    
}

public class main {
    public static void main(String[] args) {
        Book ourBook=new Book();
      
        Book yourBook=new Book(56);
       
        
    }
}
