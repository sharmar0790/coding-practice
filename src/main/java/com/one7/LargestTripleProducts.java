package com.one7;

import java.util.Arrays;

public class LargestTripleProducts {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(findMaxProduct(new int[]{1, 2, 3, 4, 5})));
//        System.out.println(Arrays.toString(findMaxProduct(new int[]{2,1,2,1,2})));
        System.out.println(Arrays.toString(findMaxProduct(new int[]{2, 4, 7, 1, 5, 3})));
    }

    private static int[] findMaxProduct(int[] arr) {

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr.length <= 2 || i == 0 || i == 1) {
                result[i] = -1;
            } else if (i == 2) {
                int sum = arr[i - 2] * arr[i - 1] * arr[i];
                result[i] = sum;
            } else {
                int[] tarr = arr;
                for (int j = 0; j <= i; j++) {
                    for (int z = 0; z <= i - j - 1; z++) {
                        if (tarr[z] > tarr[z + 1]) {
                            // swap arr[j+1] and arr[j]
                            int temp = tarr[z];
                            tarr[z] = tarr[z + 1];
                            tarr[z + 1] = temp;
                        }
                    }
                }
                System.out.println(Arrays.toString(tarr));
                int sum = tarr[i - 2] * tarr[i - 1] * tarr[i];
                result[i] = sum;
            }
        }


        return result;
    }
}
