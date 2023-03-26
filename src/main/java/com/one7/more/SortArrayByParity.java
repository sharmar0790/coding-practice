package com.one7.more;

import java.util.Arrays;

/*
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.



Example 1:

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
Example 2:

Input: nums = [0]
Output: [0]
 */
public class SortArrayByParity {

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        int[] r = sortArrayByParity(nums);
        System.out.println(Arrays.toString(r));
    }

    public static int[] sortArrayByParity(int[] nums) {
        if (nums.length == 0
                || (nums.length == 1 && nums[0] == 0)) return new int[]{0};

        int[] res = new int[nums.length];
        int s = 0;
        int l = nums.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                res[s++] = num;
            } else {
                res[l--] = num;
            }
        }
        return res;
    }
}
