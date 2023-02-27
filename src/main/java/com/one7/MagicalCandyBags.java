package com.one7;

import java.util.Arrays;

public class MagicalCandyBags {

    public static void main(String[] args) {
        System.out.println(maxCandies(new int[]{2, 1, 7, 4, 2}, 3));
    }

    private static int maxCandies(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < k; i++) {
            Arrays.sort(arr);
            count += arr[arr.length - 1];
            arr[arr.length - 1] = arr[arr.length - 1] / 2;
            System.out.println(Arrays.toString(arr));
        }
        return count;
    }
}
