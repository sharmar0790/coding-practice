//package com.one7;
//
//import java.util.*;
//
///**
//
// Given K sorted lists of up to N elements in each list, return a sorted iterator over all the items.
// Important notes:
// * K denotes the number of lists.
// * N denotes the length of the longest list.
// * You may assume K << N
// * There aren't necessarily N items in each list, but there could be.
// * Items are not unique, if an item appears X times (in a single list or in several lists), we would expect the iterator to return the item X consecutive times.
//
// Receiving the following lists:
//
// 1: [1, 4, 5, 8, 9]
// 2: [3, 4, 4, 6]
// 3: [0, 2, 8]
//
// Would yield the following result:
//
// [0, 1, 2, 3, 4, 4, 4, 5, 6, 8, 8, 9]
//
// */
//public class MergeMultipleSortedListV2 {
//
//    public static void main(String[] args) {
//        List<Integer> l1 = Arrays.asList(1, 4, 5, 8, 9);
//        List<Integer> l2 = Arrays.asList(3, 4, 4, 6);
//        List<Integer> l3 = Arrays.asList(0, 2, 8);
//
//        List<List<Integer>> lall = new LinkedList<>();
//
//        lall.add(l1);
//        lall.add(l2);
//        lall.add(l3);
//
//        System.out.println(mergeLists(lall));
//
//
//    }
//
//    private static List<Integer> mergeLists(List<List<Integer>> lall) {
//
//        PriorityQueue<List<Integer>> pq = new PriorityQueue<>(Comparator.comparing());
//
//
//        for (List<Integer> i : lall) {
//            for (Integer a : i) {
//                pq.offer(a);
//            }
//        }
//
//        while (!pq.isEmpty()) {
//            System.out.print(pq.poll() + " ");
//        }
//
//
//        return null;
//    }
//}
