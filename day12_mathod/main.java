package day12_mathod;

public class main {
    static int sum(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    static void printStar(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static int sumOfNumber(int n) {
        if (n == 0 || n < 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return n + sumOfNumber(n - 1);
    }

    static void printStar2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        // if method is a static mathod then can call like a function but if does not
        // static type then have to make object example -
        System.out.println(sum(a, b));

        // make object main is perent class
        main obj = new main();
        System.out.println(obj.sub(a, b));
        // write a program to print
        /*
         * 
         * *
         * * *
         */
        printStar(10);

        // write a recursion function to print sum of n natural number
        int kul = sumOfNumber(6);
        System.out.println(kul);

        // write a program to print
        /*
         * * *
         * *
         * 
         */
        printStar2(10);

    }
}
