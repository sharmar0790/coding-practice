package com.one7;

import java.util.Arrays;

public class MinimumLengthSubstrings {

    public static void main(String[] args) {
        System.out.println(minLengthSubstring("dcbefebce", "fd"));
//        System.out.println(minLengthSubstring("bfbeadbcbcbfeaaeefcddcccbbbfaaafdbebedddf","cbccfafebccdccebdd"));
    }

    private static int minLengthSubstring(String s, String t) {

        int count = -1;
        int[] pos = new int[t.length()];
        for (int i = 0; i < t.length(); i++) {
            if (s.contains(String.valueOf(t.charAt(i)))) {
                pos[i] = s.indexOf(t.charAt(i)) + 1;
                s = s.replaceFirst(String.valueOf(t.charAt(i)), "");
            }
        }

        Arrays.sort(pos);

        count = pos[pos.length - 1];// - pos[0];

        if (count < t.length()) {
            count = -1;
        }
        return count;
    }
}
