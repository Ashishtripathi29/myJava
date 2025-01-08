package day19;


/*
 * we using Runnable interface place of Thread class so we can use other class.
 * in java we can't use multiple class 
 */

  class  Counter  {
    int count=0;
    public synchronized  void increment(){
        count=count+1;
    }
 
    
 }



public class MyThreadWithRaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter C=new Counter();
        Runnable obj1 = () -> {
            int i = 0;
            while (i++ <= 1000) {
                C.increment();
                // System.out.println(C.count);

            }
        };
        Runnable obj2 = () -> {
            int i = 0;
            while (i++ <= 1000) {
                C.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(C.count);

    }
}
