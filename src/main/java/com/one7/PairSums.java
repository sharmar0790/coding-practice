package com.one7;

public class PairSums {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 3}, 6));
        System.out.println(solution(new int[]{1, 5, 3, 3, 3}, 6));
    }

    private static int solution(int[] n, int k) {
        int result = 0;

        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                int sum = n[i] + n[j];
                if (sum == k) {
                    result++;
                }
            }
        }

        return result;
    }
}
