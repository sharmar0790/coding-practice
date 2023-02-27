package com.one7;

/**
 * Write a method that takes a string as input and returns true if
 * the string is a palindrome when ignoring punctuation, spaces, and
 * casing. Return false if not.
 * <p>
 * For example, the string, "A man, a plan, a canal, Panama!”
 * returns True
 */

public class CheckStringPalindromeWithSpecialCharacter {

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal, Panama!";
        boolean palindrome = checkPalindrome(s1.toLowerCase());
        System.out.println("Given String >>>>> '" + s1 + "' is a palindrome?  : " + palindrome);
    }

    private static boolean checkPalindrome(String s1) {
        char[] arr = s1.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (!Character.isAlphabetic(arr[i]) || arr[i] == ' ') {
                i++;
                continue;
            }
            if (!Character.isAlphabetic(arr[j]) || arr[j] == ' ') {
                j--;
                continue;
            }
            if (arr[i] != arr[j]) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
