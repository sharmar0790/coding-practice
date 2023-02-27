package com.one7;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class LargestTripleProductsPriorityQueue {

    public static void main(String[] args) {
        int[] codeOutput = findMaxProduct(new int[]{2, 4, 7, 1, 5, 3});
        System.out.println(Arrays.toString(codeOutput));
        int[] expectedOutput = new int[]{-1, -1, 56, 56, 140, 140};
        System.out.println(Arrays.equals(codeOutput, expectedOutput));
    }

    private static int[] findMaxProduct(int[] arr) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            queue.offer(arr[i]);
            if (queue.size() < 3) {
                result[i] = -1;
            } else {
                int x = queue.poll();
                int y = queue.poll();
                int z = queue.poll();

                result[i] = x * y * z;
                queue.offer(x);
                queue.offer(y);
                queue.offer(z);
                System.out.println(queue);
            }
        }
        return result;
    }
}
