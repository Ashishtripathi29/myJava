package day17_static;
class StaticBlock{
    public static void main(String[] args) {
        // Mobile obj1=new Mobile();
        // System.out.println(Mobile.name);

       
            try {
                Class.forName("Mobile");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
       
        
    }
}

class Mobile{
    static String name;
    String company;
    String brand;
    int price;

    static{
        name="phone";
        System.out.println("this is static");
    }
}