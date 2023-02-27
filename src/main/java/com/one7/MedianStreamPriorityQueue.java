package com.one7;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class MedianStreamPriorityQueue {
    static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public static void main(String[] args) {
//        int[] codeOutput = findMedian(new int[]{5, 15, 1, 3});
//        System.out.println(Arrays.toString(codeOutput));
//        int[] expectedOutput = new int[]{5, 10, 5, 4};
//        System.out.println(Arrays.equals(codeOutput, expectedOutput));

        int[] codeOutput = findMedian(new int[]{2, 4, 7, 1, 5, 3});
        System.out.println(Arrays.toString(codeOutput));
        int[] expectedOutput = new int[]{2, 3, 4, 3, 4, 3};
        System.out.println(Arrays.equals(codeOutput, expectedOutput));
    }

    private static int[] findMedian(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            addNum(arr[i]);
//            System.out.println("Max Heap ===" + maxHeap);
//            System.out.println("Min Heap ===" + minHeap);
            if (maxHeap.size() > minHeap.size()) {
                res[i] = maxHeap.peek();
            } else {
                res[i] = (minHeap.peek() + maxHeap.peek()) / 2;
            }
        }

        return res;
    }

    public static void addNum(int num) {
        if (maxHeap.size() == 0) {
            maxHeap.offer(num);
            return;
        }
        if (maxHeap.size() > minHeap.size()) {
            if (num <= maxHeap.peek()) {
                maxHeap.offer(num);
                minHeap.offer(maxHeap.poll());
            } else {
                minHeap.offer(num);
            }
        } else {
            if (num <= maxHeap.peek()) {
                maxHeap.offer(num);
            } else {
                minHeap.offer(num);
                maxHeap.offer(minHeap.poll());
            }
        }
    }
}
