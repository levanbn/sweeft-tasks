package com.leva;

public class Task1 {

    public static void palindrome() {
        boolean isPalindrome1 = isPalindrome("aba");
        boolean isPalindrome2 = isPalindrome("abcd");
        System.out.println(isPalindrome1);
        System.out.println(isPalindrome2);
    }

    public static boolean isPalindrome(String text) {
        int i = 0, j = text.length() - 1;
        while (i < j) {
            if (text.charAt(i) != text.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
