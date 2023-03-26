package com.one7.leetcode;

/*
Given an integer n, return the number of trailing zeroes in n!.

Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.

Example 1:

Input: n = 3
Output: 0
Explanation: 3! = 6, no trailing zero.
Example 2:

Input: n = 5
Output: 1
Explanation: 5! = 120, one trailing zero.
Example 3:

Input: n = 0
Output: 0


 */
public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        int n = 20;
        int r = trailingZeroes(n);
        System.out.println(r);
    }

    public static int trailingZeroes(int n) {
        int res = 0;

        if (n == 0 || n == 1 || n == 2) return 0;

        for (int i = 5; n / i >= 1; i *= 5) {
            res += n / i;
        }

        return res;
    }

}
