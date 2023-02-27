package com.one7.more;

/*
Problem: Rotate an array of n elements to the right by k steps. For example, with n
= 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] in = new int[]{1, 2, 3, 4, 5, 6, 7};

        int[] r = solution(in, 3);

        System.out.println(Arrays.toString(r));

    }

    private static int[] solution(int[] in, int k) {
        if (in == null || in.length == 0 || k < 0) throw new IllegalArgumentException("Illegal Argument");

        int[] r = new int[in.length];

        if (k > in.length) {
            k = k % in.length;
        }

        for (int j : in) {
            if (k == in.length) {
                k = 0;
            }
            r[k++] = j;
        }

        return r;
    }
}
