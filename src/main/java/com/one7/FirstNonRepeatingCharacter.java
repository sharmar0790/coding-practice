package com.one7;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String str = "GOOGLE";
        Map<Character, Integer> map = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
            if (map.get(str.charAt(i)) > 1) {
                queue.remove(str.charAt(i));
            } else {
                queue.add(str.charAt(i));
            }
        }
        System.out.println(queue.peek());
    }


}
