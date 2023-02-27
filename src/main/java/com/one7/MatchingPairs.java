package com.one7;

public class MatchingPairs {

    public static void main(String[] args) {
        System.out.println(matchingPairs("abcd", "adcb"));
    }

    private static int matchingPairs(String s, String t) {
        // Write your code here
        int count = 0;
        if (s.equals(t)) {
            return s.length() - 2;
        } else {
            int swappedOnce = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == t.charAt(i)) {
                    count++;
                } else if (s.substring(i + 1).contains(String.valueOf(t.charAt(i))) && swappedOnce == 0) {
                    s = swap(s, i, s.indexOf(t.charAt(i)));
                    swappedOnce = 1;
                    count++;
                }
            }
        }
        return count;
    }

    private static String swap(String s, int i, int indexOf) {
        char first = s.charAt(i);
        char last = s.charAt(indexOf);
        return s.replace(last, ' ').replace(first, last).replace(' ', first);
    }
}
