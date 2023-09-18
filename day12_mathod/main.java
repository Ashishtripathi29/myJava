package day12_mathod;

public class main {
    static int sum(int a, int b) {
        return a + b;
    }
     int sub(int a,int b){
        return a-b;
     }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        // if method is a static mathod then can call like a function but if does not static type then have to make object example -
        System.out.println(sum(a, b));

        // make object main is perent class
        main obj=new main();
        System.out.println(obj.sub(a,b));
    }
}
