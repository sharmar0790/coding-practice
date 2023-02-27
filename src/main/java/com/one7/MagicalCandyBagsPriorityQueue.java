package com.one7;

import java.util.Collections;
import java.util.PriorityQueue;

public class MagicalCandyBagsPriorityQueue {

    public static void main(String[] args) {
        int codeOutput = maxCandies(new int[]{2, 1, 7, 4, 2}, 3);
        System.out.println(codeOutput);
        int expectedOutput = 14;
        System.out.println(codeOutput == expectedOutput);
    }

    private static int maxCandies(int[] arr, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            q.offer(arr[i]);
        }
        System.out.println("After Adding in the PQ" + q);

        for (int j = 0; j < k; j++) {
            int x = q.poll();
            count += x;
            q.offer(x / 2);
            System.out.println(q);
        }
        return count;
    }
}
