package com.one7.more;

public class StringReverse {

    public static void main(String[] args) {
        String s = "abcde";
        //String o = solution1(s);
        String o = solution2(s);
        System.out.println("Output ====" + o);
    }

    /*private static String solution(String s) {
        char[] ch = s.toCharArray();
        char[] o = new char[ch.length];
        int index = 0;
        for (int i = ch.length - 1; i >= 0; i--) {
            o[index++] = ch[i];
        }
        return new String(o);
    }*/

    public static String solution2(String s) {
        char[] ch = s.toCharArray();
        char temp;
        for (int i = ch.length - 1, j = 0; i >= ch.length / 2 && j <= ch.length / 2; i--, j++) {
            temp = ch[j];
            ch[j] = ch[i];
            ch[i] = temp;
        }
        return new String(ch);
    }
}
