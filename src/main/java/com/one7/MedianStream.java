package com.one7;

import java.util.Arrays;

public class MedianStream {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findMedian(new int[]{5, 15, 1, 3})));
        System.out.println(Arrays.toString(findMedian(new int[]{1, 2})));
        System.out.println(Arrays.toString(findMedian(new int[]{2, 4, 7, 1, 5, 3})));
    }

    private static int[] findMedian(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                result[i] = arr[i];
            } else {
                int[] temp = Arrays.copyOfRange(arr, 0, i + 1);
                Arrays.sort(temp);
                if (temp.length == 2) {
                    result[i] = Arrays.stream(temp).sum() / 2;
                } else if (temp.length % 2 == 0) {
                    result[i] = (temp[(temp.length / 2) - 1] + temp[(temp.length / 2)]) / 2;
                } else {
                    result[i] = temp[(temp.length / 2)];
                }
            }
        }

        return result;
    }
}
