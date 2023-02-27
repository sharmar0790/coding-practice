package com.one7;

public class CheckOccurenceOfABeforeB {
    public static void main(String[] args) {
        String s = "abba";
        boolean r = soluition(s);
        System.out.println(r);
    }

    private static boolean soluition(String s) {
        boolean r = true;
        if (!s.contains("a")) return true;
        if (!s.contains("b")) return true;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'b' && s.charAt(i + 1) == 'a') {
                r = false;
            }
        }
        return r;
    }
}
