package day19;

class MyError{
    public void NewError() throws Exception{
        System.out.println("class loading..");
        Class.forName("day19.ThroseErrors");
        System.out.println("class loaded done...");
    }
}

public class ThroseErrors {
    static{
        System.out.println("ThroseErrors class loaded...");
    }


    public static void main(String[] args) {
        try {
            MyError obj=new MyError();
            obj.NewError();
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        System.out.println("bye....");
    }
}
