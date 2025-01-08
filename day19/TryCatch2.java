package day19;

public class TryCatch2 {
    public static void main(String[] args) {
        int i=2;
        int j=1;
        int k=8;
        int arr[]=new int[5];
        try {
            k=i/j;
            System.out.println(arr[5]);

        }catch(ArithmeticException e){
            System.out.println(e);
        }
        
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array error " +e.getMessage());
        }
         catch (Exception e) {
            System.out.println("some thing went wrong "+e.getMessage());
        }
        System.out.println("bye..."+k);
    }
}
