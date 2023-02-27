package com.one7.more;

public class LowestIntegerInSubArrayInGivenRange {

    public static void main(String[] args) {

        int[] in = new int[]{1, 3, 2, 4, 5, 7, 4, 2, 1, 4, 5, 7, 8, 9};
        int[] range = new int[]{2, 10};
        int r = solution(in, range);

        System.out.println(r);
    }

    private static int solution(int[] in, int[] range) {
        int a = range[0];
        int b = range[1];

        int[] temp = new int[in.length];
        for (int i = 0; i < in.length; i++) {
            if (in[i] > a && in[i] < b) {
                temp[i] = in[i];
            }
        }

        int temp_a = temp[0];
        for (int j = 1; j < temp.length; j++) {
            if(temp[j] == 0){
                continue;
            }
            if(temp_a == 0){
                temp_a = temp[j];
            }
            if (temp_a >= temp[j]) {
                temp_a = temp[j];
            }
        }

        return temp_a;
    }
}
