package com.one7;

import java.util.Arrays;

public class ElementSwapping {
    public static void main(String[] args) {
//        int[] codeOutput = findMinArray(new int[]{5, 3, 1}, 2);
//        System.out.println("codeOutput===  " + Arrays.toString(codeOutput));
//        int[] expectedOutput = {1, 5, 3};
//        System.out.println(Arrays.equals(codeOutput, expectedOutput));

        int[] codeOutput1 = findMinArray(new int[]{8, 9, 11, 2, 1}, 3);
        System.out.println("codeOutput===  " + Arrays.toString(codeOutput1));
        int[] expectedOutput1 = {2, 8, 9, 11, 1};
        System.out.println(Arrays.equals(codeOutput1, expectedOutput1));
    }

    private static int[] findMinArray(int[] arr, int k) {
//        for (int i = 0; i < k; i++) {
//            for(int j=0;j<arr.length;j++){
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    break;
//                }
//            }
//
//            System.out.println(Arrays.toString(arr));
//        }
//        return arr;
        for (int i = 0; i < arr.length - 1 && k > 0; ++i) {
            int pos = i;
            for (int j = i + 1; j < arr.length; ++j) {
                if (j - i > k) break;
                if (arr[j] < arr[pos]) pos = j;
            }
            int temp;
            for (int j = pos; j > i; --j) {
                temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
            k -= pos - i;
        }
        return arr;
    }
}
