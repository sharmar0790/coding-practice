package com.one7.more;

import java.util.Stack;

/*
Evaluate the value of an arithmetic expression in Reverse Polish Notation. Valid operators
are +, -, *, /. Each operand may be an integer or another expression. For
example:
["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 */
public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] in = new String[]{"2", "1", "+", "3", "*"};

        int r = solution(in);

        System.out.println("Result=== " + r);
    }

    private static int solution(String[] in) {
        if (in == null || in.length == 0) return 0;

        String operators = "+-*/";

        Stack<String> stack = new Stack<>();

        int i = 0, j = 0;
        for (String s : in) {
            if (!operators.contains(s)) {
                stack.push(s);
            } else {
                i = Integer.parseInt(stack.pop());
                j = Integer.parseInt(stack.pop());
                switch (s) {
                    case "+":
                        i = i + j;
                        stack.push(String.valueOf(i));
                        break;
                    case "-":
                        i = i - j;
                        stack.push(String.valueOf(i));
                        break;
                    case "*":
                        i = i * j;
                        stack.push(String.valueOf(i));
                        break;
                    case "/":
                        i = i / j;
                        stack.push(String.valueOf(i));
                        break;
                }
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
