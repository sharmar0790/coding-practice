package com.one7.sorting;

public class BalancedSplitUsingSet {
    public static void main(String[] args) {
        System.out.println(balancedSplitExists(new int[]{1, 5, 7, 1}));
        System.out.println(balancedSplitExists(new int[]{12, 7, 6, 7, 6}));
    }

    public static boolean balancedSplitExists(int[] arr) {
        // Write your code here
//        Arrays.sort(arr);
        int sum = 0;
        boolean res = false;
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            sum += arr[i];
            if (sum == arr[j]) {
                j--;
                res = true;
            } else {
                i++;
                res = false;
            }

        }
        return res;
    }
}
