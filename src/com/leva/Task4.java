package com.leva;

public class Task4 {

    public static void properly() {
        boolean isCorrect = isProperly("())(((()))");
        System.out.println(isCorrect);
    }

    public static boolean isProperly(String sequence) {
        int count = 0;
        for (int i = 0; i < sequence.length(); i++) {

            if (sequence.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }

}
