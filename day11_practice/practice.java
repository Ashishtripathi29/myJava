package day11_practice;

import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        System.out.println("here I am going to start with some practice with arrrays");

        // 1st question
        System.out.println("Create an array with 5 floats and calculate their sum");

        // float nums[]={23,55,643,55,23,6};
        float nums[] = { 23.0f, 55.2f, 643.5f, 55f, 235.5f, 6f };
        float sum = 0;
        for (float i : nums)
            sum += i;
        System.out.println("jay shree ram");
        System.out.println(sum);
        System.out.println("1st question is done");

        // 2nd question
        System.out.println("write a program to find out given number is in the array or not");
        int num = 3;
        int[] arr = { 1, 2, 3, 44, 5, 66, 34, 664, 45 };
        boolean isInArray = false;
        for (int i : arr) {
            if (i == num) {

                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("number is in the array");
        } else {
            System.out.println("number is not in the array");
        }

        // 2nd question is done

        // 3rd question
        System.out.println(
                "calculate the average marks from an array containing marks of all students in physics using for-each loop");

        float marks[] = { 56.5f, 67.5f, 77.5f, 87.0f, 99.0f, 45.0f };
        float sunMarks = 0;
        for (float mark : marks) {
            sunMarks += mark;
        }
        System.out.println("avs of physics " + sunMarks / marks.length);
        System.out.println("avs of physics " + 3f / 2);

        // how to change float to integer
        int a = (int) 3f / 2;
        System.out.println(a);

        // end of 3rd question

        // 4th
        System.out.println("create a java program to add two matrces");
        int[][] mat1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int[][] mat2 = {
                { 9, 8, 7 },
                { 6, 5, 4 },
                { 3, 2, 1 }
        };
        int result[][] = new int[3][3];

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(Arrays.toString(result[i]));
        }
        // 4th question end

        // 5th question
        System.out.println("write a java program to reverse an array");
        char st[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
        int l = st.length;
        int n = Math.floorDiv(l, 2);
        for (int i = 0; i < n; i++) {
            char t = st[i];
            st[i] = st[l - i - 1];
            st[l - i - 1] = t;
        }
        System.out.println(Arrays.toString(st));

        // 5th is completed

        // 6th question
        System.out.println(" write a java program to find the maximum element in an array");

        int arrNum[] = { 2, 33, 22, 6, 34, 77 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arrNum.length; i++) {
            if (max < arrNum[i])
                max = arrNum[i];
        }
        System.out.println("the max number is " + max);
        // 6th done

        // 7th question
        System.out.println(" write a java program to find the maximum element in an array");

        int arrNums[] = { 2, 33, 22, 1, 6, 34, 77 };
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arrNums.length; i++) {
            if (min > arrNums[i])
                min = arrNums[i];
        }
        System.out.println("the min number is " + min);

        // 7th done

        //8th question
        System.out.println("write a java program to find whether an array is sorted or not");

        // int sortedArr[]={4,6,2,6,7,2,3,73};
        int sortedArr[]={ 1,2,3,4,5,6,7};
        boolean sorted=true;
        for (int i = 0; i < sortedArr.length-1; i++) {
            if(sortedArr[i]>sortedArr[i+1]) sorted=false;
        }
        if(sorted) System.out.println("array is sorted");
        else System.out.println("array is not sorted");
    }
}
