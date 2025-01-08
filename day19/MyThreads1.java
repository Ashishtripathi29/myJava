package day19;
class Thread1 extends Thread{
    public void run(){
        int i=0;
        while (i++<100) {
            System.out.println("Ashish");
        }
    }
}
class Thread2 extends Thread{
    public void run(){
        int i=0;
        while (i++<100) {
            System.out.println("Shivam");
        }
    }
}
class Thread3 extends Thread{
    public void run(){
        int i=0;
        while (i++<100) {
            System.out.println("Prateek");
        }
    }
}
class Thread4 extends Thread{
    public void run(){
        int i=0;
        while (i++<100) {
            System.out.println("Chhotu");
        }
    }
}

public class MyThreads1 {
    public static void main(String[] args) {
        Thread1 T1=new Thread1();
        Thread2 T2=new Thread2();
        Thread3 T3=new Thread3();
        Thread4 T4=new Thread4();
        T1.start();
        T2.start();
        T3.start();
        T4.start();
    }
}
