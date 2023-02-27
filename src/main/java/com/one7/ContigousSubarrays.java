package com.one7;

import java.util.Arrays;

public class ContigousSubarrays {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3, 4, 1, 6, 2})));
    }

    public static int[] solution(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i <= arr.length - 1; i++) {
            int count = 0;

            int item = arr[i];
            int left = i - 1;
            int right = i + 1;

            while (left >= 0 && arr[left] < item) {
                count++;
                left--;
            }

            while (right < arr.length && arr[right] < item) {
                count++;
                right++;
            }

            result[i] = count + 1;

            /*
            if (i == 0 && arr[i] < arr[i + 1]) {
                count++;
            } else {
                for (int j = 0; j <= i + 1; j++) {
                    if (j == arr.length) {
                        continue;
                    }
                    if (j == i) {
                        count++;
                    } else if (arr[j] < arr[i]) {
                        count++;
                    }
                }
            }
            result[i] = count;*/
        }
        return result;
    }
}
