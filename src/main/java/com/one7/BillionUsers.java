package com.one7;

public class BillionUsers {

    public static void main(String[] args) {
//        System.out.println(getBillionUsersDay(new float[]{1.5f}));
        System.out.println(getBillionUsersDay(new float[]{1.01f, 1.02f}));
    }

    private static int getBillionUsersDay(float[] growthRates) {
        int start = 1;
        int end = 2000;
        double target = 1000000000d;
        while (start < end) {
            int total = 0;
            int mid = start + (end - start) / 2;
            for (float g : growthRates) {
                total += Math.pow(g, mid);
            }

            if (total == target) {
                return mid;
            }

            if (total < target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
