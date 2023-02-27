package com.one7;

import java.util.Arrays;

public class FindIntegersWhoseSumIsEqualToZero {

    public static void main(String[] args) {
        int[] inputArray = new int[]{1, 2, -2, -1, 4, 5, 6, -7, -4, -2};

        int[][] r = solution(inputArray);
        System.out.println("Result ==== " + Arrays.deepToString(r));
    }

    private static int[][] solution(int[] inputArray) {

        int[][] result = new int[inputArray.length][];
        int x = 0;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                int sum = inputArray[i] + inputArray[j];
                if (sum == 0) {
                    int[] temp = new int[]{inputArray[i], inputArray[j]};
                    result[x++] = temp;
                }
            }
        }
        return result;
    }
}
