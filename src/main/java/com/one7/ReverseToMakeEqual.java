package com.one7;

import java.util.Arrays;

public class ReverseToMakeEqual {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4}, new int[]{1, 4, 3, 2}));
    }

    private static boolean solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        if (A.length != B.length) return false;

        for (int i = 0; i < A.length; i++) {
            if (A[i] != B[i]) {
                return false;
            }
        }
        return true;
    }
}
