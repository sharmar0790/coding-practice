package com.one7.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.



Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false
 */
public class CheckSentenceIsPangram {

    public static final List<Character> ALBHAPET_LIST = new ArrayList<>() {
        {
            add('a');
            add('b');
            add('c');
            add('d');
            add('e');
            add('f');
            add('g');
            add('h');
            add('i');
            add('j');
            add('k');
            add('l');
            add('m');
            add('n');
            add('o');
            add('p');
            add('q');
            add('r');
            add('s');
            add('t');
            add('u');
            add('v');
            add('w');
            add('x');
            add('y');
            add('z');
        }
    };

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean b = checkIfPangram(sentence);
        System.out.println(b);
    }

    public static boolean checkIfPangram(String sentence) {

        Map<Character, Integer> char_freq_map = new HashMap<>();
        for (char c : sentence.toCharArray()) {
            char_freq_map.put(c, char_freq_map.getOrDefault(c, 1) + 1);
        }
        System.out.println(char_freq_map);

        for (char s : ALBHAPET_LIST) {
            char_freq_map.remove(s);
        }

        return char_freq_map.isEmpty();
    }
}
