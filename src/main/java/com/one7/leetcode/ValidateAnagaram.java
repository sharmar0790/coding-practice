package com.one7.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 */
public class ValidateAnagaram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean b = isAnagram(s, t);
        System.out.println(b);
    }

    /*public static boolean isAnagram(String s, String t) {
        char[] chars = t.toCharArray();
        Arrays.sort(chars);
        String t1 = new String(chars);
        char[] a = s.toCharArray();
        Arrays.sort(a);
        String t2 = new String(a);
        return t1.equalsIgnoreCase(t2);
    }*/

    public static boolean isAnagram(String s, String t) {

        if (s == null || t == null || s.trim().equalsIgnoreCase("") || t.trim().equalsIgnoreCase("") ||
                s.length() != t.length()) return false;

        char[] t_chars = t.toCharArray();

        Map<Character, Integer> char_map = new HashMap<>();
        for (char c : t_chars) {
            char_map.put(c, char_map.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            if (char_map.containsKey(c)) {
                if (char_map.get(c) == 1) {
                    char_map.remove(c);
                } else {
                    char_map.put(c, char_map.getOrDefault(c, 0) - 1);
                }
            } else {
                return false;
            }
        }
        Arrays.equals(s.toCharArray(),t.toCharArray());
        return char_map.isEmpty();


//        Arrays.sort(chars);
//        String t1 = new String(chars);
//        char[] a = s.toCharArray();
//        Arrays.sort(a);
//        String t2 = new String(a);
//        return t1.equalsIgnoreCase(t2);
    }
}
