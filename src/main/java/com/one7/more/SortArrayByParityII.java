package com.one7.more;

import java.util.Arrays;

/*
Given an array of integers nums, half of the integers in nums are odd, and the other half are even.

Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.

Return any answer array that satisfies this condition.



Example 1:

Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
Example 2:

Input: nums = [2,3]
Output: [2,3]
 */
public class SortArrayByParityII {

    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 7};
        int[] r = sortArrayByParityII(nums);
        System.out.println(Arrays.toString(r));
    }

    private static int[] sortArrayByParityII(int[] nums) {
        if (nums.length == 0
                || (nums.length == 1 && nums[0] == 0)) return new int[]{0};

        int[] res = new int[nums.length];
        int e = 0;
        int o = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                res[e] = nums[i];
                e += 2;
            } else {
                res[o] = nums[i];
                o += 2;
            }
        }
        return res;
    }
}
