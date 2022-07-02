package com.leva;

import java.util.Arrays;

public class Task3 {


    public static void contains() {
        int[] intArray = new int[]{-7, 5, 3, 1, 2, -14, -3, 7, 2};
        int notContainsMember = notContains(intArray);
        System.out.println(notContainsMember);
    }

    public static int notContains(int[] array) {
        int n = 1;
        int notMember = 0;
        Arrays.sort(array);
        if (array[0] > 1) {
            notMember = 1;
        }
        while (notMember == 0 && n < array.length) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < n && array[i + 1] > n) {
                    notMember = n;
                    break;
                }
            }
            n++;
        }
        System.out.println(notMember);
        if (n == array.length && notMember == 0) {
            notMember = array.length + 1;
        }

        return notMember;
    }
}
