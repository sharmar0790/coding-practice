package com.one7.more;

import java.util.Arrays;

public class FindAndSortOddNumber {

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        int[] r = findAndSortOddNumber(nums);
        System.out.println(Arrays.toString(r));
    }

    private static int[] findAndSortOddNumber(int[] nums) {
        if (nums.length == 0
                || (nums.length == 1 && nums[0] == 0)) return new int[]{0};

        int oddNumbers = 0;
        for (int num : nums) {
            if (num % 2 != 0) {
                ++oddNumbers;
            }
        }

        int[] res = new int[oddNumbers];
        for (int i = 0; i < oddNumbers; i++) {
            if (nums[i] % 2 != 0) {
                res[i] = nums[i];
            }
        }
        Arrays.sort(res);
        return res;
    }
}
