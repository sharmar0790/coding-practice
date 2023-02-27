package com.one7;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Given K sorted lists of up to N elements in each list, return a sorted iterator over all the items.
 * Important notes:
 * K denotes the number of lists.
 * N denotes the length of the longest list.
 * You may assume K << N
 * There aren't necessarily N items in each list, but there could be.
 * Items are not unique, if an item appears X times (in a single list or in several lists), we would expect the iterator to return the item X consecutive times.
 * <p>
 * Receiving the following lists:
 * <p>
 * 1: [1, 4, 5, 8, 9]
 * 2: [3, 4, 4, 6]
 * 3: [0, 2, 8]
 * <p>
 * Would yield the following result:
 * <p>
 * [0, 1, 2, 3, 4, 4, 4, 5, 6, 8, 8, 9]
 */
public class MergeMultipleSortedList {

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 4, 5, 8, 9);
        List<Integer> l2 = Arrays.asList(3, 4, 4, 6);
        List<Integer> l3 = Arrays.asList(0, 2, 8);

        List<List<Integer>> lall = new LinkedList<>();

        lall.add(l1);
        lall.add(l2);
        lall.add(l3);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (List<Integer> i : lall) {
            for (Integer a : i) {
                pq.offer(a);
            }
        }

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}
