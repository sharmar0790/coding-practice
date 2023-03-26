package com.one7.more;

public class Compress {

    public static void main(String[] args) {
        char[] chars = new char[]{'a', 'a', 'b', 'b', 'b'};
        solution(chars);
    }

    private static void solution(char[] chars) {

        if(chars.length == 0)return;

        char c = chars[0];
        int count = 0;
        for (int i = 1; i < chars.length; i++) {
            if(c == chars[i]){
                count++;
            }
        }
    }
}
