package com.one7;

import java.util.Arrays;

public class RevenueMilestones {

    public static void main(String[] args) {
        int[] codeOutput1 = getMilestoneDays(new int[]{700, 800, 600, 400, 600, 700}, new int[]{3100, 2200, 800, 2100, 1000});
        System.out.println("codeOutput===  " + Arrays.toString(codeOutput1));
        int[] expectedOutput1 = {5, 4, 2, 3, 2};
        System.out.println(Arrays.equals(codeOutput1, expectedOutput1));
    }

    private static int[] getMilestoneDays(int[] revenues, int[] milestones) {
        int[] res = new int[milestones.length];
        for (int j = 0; j < milestones.length; j++) {
            int sum = 0;
            for (int i = 0; i < revenues.length; i++) {
                sum += revenues[i];
                if (sum >= milestones[j]) {
                    res[j] = i + 1;
                    break;
                } else {
                    res[j] = -1;
                }
            }
        }
        return res;
    }
}
