package com.one7.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalanceBrackets {

    public static void main(String[] args) {
        System.out.println(isBalanced("{[()]}"));
    }

    private static boolean isBalanced(String s) {
        // Write your code here
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.add(c);
            } else {
                if (parenthesisMap().get(c) != stack.peek()) {
                    return false;
                } else {
                    stack.pop();
                }
            }

        }
        return stack.isEmpty();
    }

    private static Map<Character, Character> parenthesisMap() {
        Map<Character, Character> temp = new HashMap<>();
        temp.put(')', '(');
        temp.put(']', '[');
        temp.put('}', '{');
        return temp;
    }
}
