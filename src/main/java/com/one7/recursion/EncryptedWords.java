package com.one7.recursion;

public class EncryptedWords {
    public static void main(String[] args) {
//        System.out.println("Result ====" + findEncryptedWord("abc"));
//        System.out.println("Result ====" + findEncryptedWord("abcxcba"));
        System.out.println(findEncryptedWord("abcd"));
    }

    private static String findEncryptedWord(String s) {
        StringBuilder r = new StringBuilder("");
        if (s.length() == 1 || s.length() == 2) {
            r.append(s);
        } else if (s.length() % 2 == 0) {
            r.append(s.charAt(s.length() / 2 - 1));
            r.append(findEncryptedWord(s.substring(0, s.length() / 2 - 1)));
            r.append(findEncryptedWord(s.substring(s.length() / 2)));

        } else {
            r.append(s.charAt(s.length() / 2));
            r.append(findEncryptedWord(s.substring(0, s.length() / 2)));
            r.append(findEncryptedWord(s.substring(s.length() / 2 + 1)));
        }
        return r.toString();
    }
}
