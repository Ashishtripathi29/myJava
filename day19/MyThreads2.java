package day19;

class Thread1 extends Thread {
    public void run() {
        int i = 0;
        while (i++ < 100) {
            System.out.println("Ashish");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }

        }
    }
}

class Thread2 extends Thread {
    public void run() {
        int i = 0;
        while (i++ < 100) {
            System.out.println("Shiv");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }
        }
    }
}
class Thread3 extends Thread {
    String name="";
    public Thread3(String name){
        this.name=name;
    }
    public void run() {
        int i = 0;
        while (i++ < 100) {
            System.out.println(this.name);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }

        }
    }
}

public class MyThreads2 {
    public static void main(String[] args) {
        // Thread1 T1 = new Thread1();
        // Thread2 T2 = new Thread2();
        // // System.out.println(T1.getPriority());
        // // System.out.println(T2.getPriority());
        // // T1.setPriority(Thread.MAX_PRIORITY);
        // // System.out.println(T1.getPriority());
        // T1.start();
        // // try {
        // //     Thread.sleep(1000);
        // // } catch (InterruptedException e) {
       
        // //     e.printStackTrace();
        // // }
        // T2.start();

        Thread3 T3 = new Thread3("Ashish");
        Thread3 T4 = new Thread3("Shiv");
        T3.start();
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        T4.start();

    }
}
