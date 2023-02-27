package com.one7;

import java.util.Arrays;

public class SlowSum {

    public static void main(String[] args) {
        int codeOutput = getTotalTime(new int[]{4, 2, 1, 3});
        System.out.println("codeOutput===  " + codeOutput);
        int expectedOutput = 26;
        System.out.println(codeOutput == expectedOutput);
    }

    private static int getTotalTime(int[] arr) {

        Arrays.sort(arr);
        int penalty = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int newV = arr[arr.length - i - 1] + arr[arr.length - i - 2];
            penalty += newV;
            arr[arr.length - i - 1] = 0;
            arr[arr.length - i - 2] = newV;
        }

        return penalty;
    }
}
