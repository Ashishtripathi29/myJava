package day19;

public class TryCatch {
    public static void main(String[] args) {
        int i=5;
        int j=0;
        int k=0;
        try {
            k=i/j;
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("bye... "+k);
    }
}
