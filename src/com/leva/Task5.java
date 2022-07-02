package com.leva;

public class Task5 {

    public static void variants() {
        {
            int variants = countVariants(23);
            System.out.println(variants);
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int countVariants(int stairsCount) {
        return fibonacci(stairsCount + 1);
    }


}
