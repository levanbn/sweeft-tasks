package com.leva;

public class Task2 {

    public static void coinSplit() {
        int answer = minSplit(15);
        System.out.println(answer);
    }

    public static int minSplit(int amount) {
        int split = 0;
        split += amount / 50;
        amount %= 50;

        split += amount / 20;
        amount %= 20;

        split += amount / 10;
        amount %= 10;

        split += amount / 5;
        amount %= 5;

        split += amount;
        return split;
    }
}

