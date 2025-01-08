package day19;


/*
 * we using Runnable interface place of Thread class so we can use other class.
 * in java we can't use multiple class 
 */









// class MyTh1 implements Runnable{
//     public void run(){
//         int i=0;
//         while (i++<=10) {
//             System.out.println("hii");
//             try {Thread.sleep(500);} catch (InterruptedException e) {}
//         }
//     }
// }
// class MyTh2 implements Runnable{
//     public void run(){
//         int i=0;
//         while (i++<=10) {
//             System.out.println("Hello...");
//             try {Thread.sleep(400);} catch (InterruptedException e) {}
//         }
//     }
// }

public class MyThreads3 {
    public static void main(String[] args) {
        // ================== 1st mathod ==================
        // MyTh1 obj1=new MyTh1();
        // MyTh2 obj2=new MyTh2();

        // Thread t1=new Thread(obj1);
        // Thread t2=new Thread(obj2);
        // t1.start();
        // t2.start();

        // ================== 2nd mathod ==================
        // Runnable obj1 = new Runnable() {
        // @Override
        // public void run() {
        // int i = 0;
        // while (i++ <= 10) {
        // System.out.println("hii");
        // try {
        // Thread.sleep(500);
        // } catch (InterruptedException e) {
        // }
        // }
        // }
        // };
        // Runnable obj2 = new Runnable() {
        // @Override
        // public void run() {
        // int i = 0;
        // while (i++ <= 10) {
        // System.out.println("Hello...");
        // try {
        // Thread.sleep(500);
        // } catch (InterruptedException e) {
        // }
        // }
        // }
        // };

        // Thread t1 = new Thread(obj1);
        // Thread t2 = new Thread(obj2);
        // t1.start();
        // t2.start();

        // ================== 3rd mathod using lamda ==================
        Runnable obj1 = () -> {
            int i = 0;
            while (i++ <= 100) {
                System.out.println("hii "+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        };
        Runnable obj2 = () -> {
            int i = 0;
            while (i++ <= 100) {
                System.out.println("Hello... "+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

    }
}
