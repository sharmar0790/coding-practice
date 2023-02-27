package com.one7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RevenueMilestonesMap {

    public static void main(String[] args) {
        int[] codeOutput1 = getMilestoneDays(new int[]{700, 800, 600, 400, 600, 700}, new int[]{3100, 2200, 800, 2100, 1000});
        System.out.println("codeOutput===  " + Arrays.toString(codeOutput1));
        int[] expectedOutput1 = {5, 4, 2, 3, 2};
        System.out.println(Arrays.equals(codeOutput1, expectedOutput1));
    }

    private static int[] getMilestoneDays(int[] revenues, int[] milestones) {
        int[] res = new int[milestones.length];
        Arrays.fill(res, -1);
        Map<Integer, Integer> map = new HashMap<>();
        for (int a = 0; a < milestones.length; a++) {
            map.put(milestones[a], a);
        }

        Arrays.sort(milestones);

        int sum = 0;
        int j = 0;
        for (int i = 0; i < revenues.length; i++) {
            sum += revenues[i];
            while (j < milestones.length && sum >= milestones[j]) {
                res[map.get(milestones[j])] = i + 1;
                j++;
            }
        }
        return res;
    }
}
