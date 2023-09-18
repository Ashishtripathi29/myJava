package day10_arrays.day10_2;
import java.util.Arrays;

public class main {
    public static void main(String[] args){
        System.out.println("jay ho");
        // we are going to start 2d array
        int [][]myArr=new int[3][4];

        System.out.println("this is my new 2d arrays");
        for(int i=0;i<myArr.length;i++){
            System.out.println(Arrays.toString(myArr[i]));
        }

        System.out.println("here we are going to fill the number");
        int i=0;
        
        for (int[] arrEl : myArr) {
            int j=0;
            for (int el : arrEl) {
                // System.out.printf("i=%d  j=%d ",i,j);
                myArr[i][j]=i+j;
                j++;
            }
            System.out.println(Arrays.toString(myArr[i]));
            i++;

        }
        // System.out.println(Arrays.deepToString(myArr));
    }
}
