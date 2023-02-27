package com.one7.more;

import java.util.Arrays;

public class SmallestPositiveIntegerDOesNotOccurInArray {

    public static void main(String[] args) {
        int[] in = new int[]{1, 3, 6, 4, 1, 2};
        int r = solution2(in);
        System.out.println(r);

        in = new int[]{-1, -3};
        r = solution2(in);
        System.out.println(r);

        in = new int[]{1, 2, 3};
        r = solution2(in);
        System.out.println(r);
    }

    private static int solution(int[] in) {
        Arrays.sort(in);
        int t = 1;
        for (int j : in) {
            if (t == j) {
                t = j;
            } else if (t <= j) {
                t++;
            }
        }
        return t == in[in.length - 1] ? ++t : t;
    }


    private static int solution2(int[] in) {

        boolean[] visitedArray = new boolean[in.length];

        for (int i : in) {
            if (i > 0 && i < visitedArray.length) {
                visitedArray[i] = true;
            }
        }

        for (int z = 1; z < visitedArray.length; z++) {
            if (!visitedArray[z]) {
                return z;
            }
        }
        return visitedArray.length + 1;
    }
}
