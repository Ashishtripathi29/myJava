import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        System.out.println("Array\n");
        // int nums[]=new int[5];
        // nums[1]=4;
        // System.out.println(nums[1]);

        // we are going to start arrays
        System.out.println("we are goingt to start array");
        // ***************************** 1st way ***************************
        int nums[]; // define the arrays variable
        nums = new int[5]; // asign the length
        nums[1] = 5; // asing the value

        // we gate the nums[1] is 5 and all value we get 0 because of when I asign the
        // insiligation the length of array then it auto asign 0 in all the index
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);
        System.out.println(Arrays.toString(nums));
        // System.out.println(nums[5]); // error out of bond

        // ******************************** 2nd way ******************************
        // here I decleare variable and insiligation the array
        String st[] = new String[5];
        st[1] = "a";
        // System.out.println(st);
        System.out.println(Arrays.toString(st));

        int myArr[] = { 5, 3, 6, 2, 7 };
        System.out.println(Arrays.toString(myArr));
        // print arrays using for loop
        for (int i : myArr) {
            System.out.println(i);
        }

        float fNum[] = new float[5];
        for (int i = 0; i < fNum.length; i++) {
            fNum[i] = i;
            System.out.println(fNum[i]);
            // System.out.println(type((fNum[i]).getClass().getName()));
        }

        // double myData=5;
        // System.out.println(type(myData));

        int Arr2d[][] = new int[2][3];
        Arr2d[0][0] = 10;
        Arr2d[0][1] = 9;
        Arr2d[0][2] = 8;
        Arr2d[1][0] = 7;
        Arr2d[1][1] = 6;
        Arr2d[1][2] = 5;

        for (int[] is : Arr2d) {
            for (int i : is) {
                System.out.println(i);
            }
        }

        // Example 2: Print an Array using standard library Arrays

        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(array));

    }

    // private static char[] type(double myData) {
    // return null;
    // }
}