package com.one7.recursion;

import java.util.Arrays;

public class ChangeInAForeignCurrency {

    public static void main(String[] args) {
       // System.out.println(canGetExactChange(94, new int[]{5, 10, 25, 100, 200}));
        System.out.println(canGetExactChange(75, new int[]{4, 17, 29}));
    }

    private static boolean canGetExactChange(int targetMoney, int[] denominations) {
        /*if (targetMoney < 0) {
            return false;
        } else if (targetMoney == 0) {
            return true;
        } else {
            for (int i = 0; i < denominations.length; i++) {
                if (canGetExactChange(targetMoney - denominations[i], denominations)) {
                    return true;
                }
            }
        }*/

        Arrays.sort(denominations);
        if (targetMoney < 0) {
            return false;
        } else if (targetMoney == 0) {
            return true;
        } else {
            for (int i = denominations.length - 1; i > 0; i--) {
                if (targetMoney % denominations[i] == 0) {
                    return true;
                } else {
                    targetMoney = targetMoney % denominations[i];
                }
            }
        }

        return false;
    }
}
