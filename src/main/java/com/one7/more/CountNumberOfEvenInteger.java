package com.one7.more;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountNumberOfEvenInteger {

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5, 12, 23, 34, 45, 56};

        int count = solution(input);
        int count2 = solutionUsingStream(input);

        System.out.println("Count====" + count);
        System.out.println("Count2====" + count2);

        List<Integer> inputList = new ArrayList<>() {
            {
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
                add(12);
                add(23);
                add(34);
                add(45);
                add(56);
            }
        };
        count2 = solutionUsingStream(inputList);

        System.out.println("Count3====" + count2);
    }

    private static int solution(int[] input) {
        int count = 0;
        for (int j : input) {
            if (j % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static int solutionUsingStream(int[] input) {
        return (int) Arrays.stream(input).filter(a -> a % 2 == 0).count();
    }

    private static int solutionUsingStream(List<Integer> inputList) {
        return (int) inputList.stream().filter(a -> a % 2 == 0).count();
    }
}
