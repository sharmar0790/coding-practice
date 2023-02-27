package com.one7.more;

import java.util.Arrays;

/*
Given an integer array, move all elements that are 0 to the
left while maintaining the order of other elements in the array. The array has to be modified in-place.
ex: [1,10,20,0,59,63,0,88,0]
Output: [0,0,0,1,10,20,59,63,88]
 */
public class MoveZeroesToLeftOfAnArray {

    public static void main(String[] args) {
        int[] in = {1, 10, 20, 0, 59, 63, 0, 88, 0};
        int[] result = solution(in);
        System.out.println("Result === ...." + Arrays.toString(result));
    }

    private static int[] solution(int[] in) {
        for (int i = 0; i < in.length; i++) {
            if (in[i] == 0) {
                int temp = in[i];
                for (int z = i; z > 0; z--) {
                    in[z] = in[z - 1];
                }
                in[0] = temp;
            }
        }
        return in;
    }
}
