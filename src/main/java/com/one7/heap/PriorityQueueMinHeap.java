package com.one7.heap;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueMinHeap {

    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(1);
        minHeap.add(20);
        minHeap.add(4);
        minHeap.add(3);
        minHeap.add(10);
        minHeap.add(5);

        System.out.println(minHeap);
        System.out.println(minHeap.peek());
        //System.out.println(minHeap.poll());
        System.out.println(minHeap);

        System.out.println("\n\nMin heap as a PriorityQueue:");
        Iterator iter = minHeap.iterator();
        while (iter.hasNext())
            System.out.print(iter.next() + " ");

        // remove head (root of min heap) using poll method
        minHeap.poll();
        System.out.println("\n\nMin heap after removing root node:");
        //print the min heap again
        Iterator<Integer> iter2 = minHeap.iterator();
        while (iter2.hasNext())
            System.out.print(iter2.next() + " ");
    }
}
