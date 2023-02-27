package com.one7.graph;

import java.util.*;
import java.util.stream.IntStream;

public class MinimizingPermutations {
    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{3, 1, 2}));
    }

    private static int minOperations(int[] arr) {
        // Write your code here
        int op = 0;
        int[] target = IntStream.rangeClosed(1, arr.length).toArray();
        System.out.println(Arrays.toString(target));
        Queue<int[]> q = new LinkedList<>();
        q.offer(arr);
        Set<String> s = new HashSet<>();
        s.add(Arrays.toString(arr));
        while (!q.isEmpty()) {
            for (int a = 0; a < q.size(); a++) {
                int[] curr = q.poll();
                if (Arrays.equals(target, curr)) {
                    return op;
                }
                for (int i = 0; i < arr.length; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        int[] temp = curr.clone();
                        reverse(temp, i, j);
                        if (!s.contains(Arrays.toString(temp))) {
                            s.add(Arrays.toString(temp));
                            q.offer(temp);
                        }
                    }
                }
            }
            op++;
        }
        return op;
    }

    private static void reverse(int[] arr, int from, int to) {
        for (; from < to; from++, to--) {
            int tmp = arr[from];
            arr[from] = arr[to];
            arr[to] = tmp;
        }
    }
}
