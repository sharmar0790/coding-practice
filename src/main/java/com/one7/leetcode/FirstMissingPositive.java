package com.one7.leetcode;

/*
Given an unsorted integer array nums, return the smallest missing positive integer.

You must implement an algorithm that runs in O(n) time and uses constant extra space.



Example 1:

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.
 */
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {7, 8, 9, 11, 12};
        int r = firstMissingPositive(nums);
        System.out.println(r);
    }

    public static int firstMissingPositive(int[] nums) {
        int[] res = new int[256];
        for (int num : nums) {
            if (num >= 0) {
                res[num] = -1;
            }
        }
        for (int j = 1; j < res.length; j++) {
            if (res[j] != -1) {
                return j;
            }
        }
        return 0;
    }
}
