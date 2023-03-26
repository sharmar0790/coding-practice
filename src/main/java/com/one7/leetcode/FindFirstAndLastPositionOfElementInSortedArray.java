package com.one7.leetcode;

import java.util.Arrays;

/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 */
public class FindFirstAndLastPositionOfElementInSortedArray {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
//        int[] nums = {};
//        int[] r = searchRange(nums, 8);
//        System.out.println(Arrays.toString(r));

        int[] r = searchRangeUsingBinarySearch(nums, 4);
        System.out.println(Arrays.toString(r));
    }

    private static int[] searchRangeUsingBinarySearch(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1, -1};
        int left = nums[0];
        int right = nums[nums.length - 1];
        int mid = (left + right) / 2;
        int start = 0;
        int last = 0;
        if (target < mid) {
            last = (nums.length) / 2;
        } else {
            start = (nums.length) / 2;
            last = nums.length;
        }
        int[] res = {-1, -1};
        int index_0 = 0;
        int index_1 = 1;
        for (int i = start; i <= last; i++) {
            if (nums[i] == target) {
                if (index_0 == 0) res[index_0++] = i;
                else res[index_1] = i;
            }
        }
        return res;
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        int index_0 = 0;
        int index_1 = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (index_0 == 0) res[index_0++] = i;
                else res[index_1] = i;
            }
        }
        return res;
    }
}
