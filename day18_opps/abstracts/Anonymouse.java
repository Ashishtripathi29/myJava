package day18_opps.abstracts;

public class Anonymouse {
   public static void main(String[] args) {
    wagnor obj4 = new wagnor(){
        public void drive(){
            System.out.println("my driving started");
        }
    };
    obj4.drive();
    obj4.horn();
   }
}
