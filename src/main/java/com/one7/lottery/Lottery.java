package com.one7.lottery;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Lottery {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Code is Working, please choose the option from 'EM' or 'SFL' and number of times want to generate the numbers");
            System.out.println("Command would be 'java TestPractice.java EM 2'");
            return;
        }
        for (String a : args) {
            System.out.println("Args =====" + a);
        }

        Random rand = new Random();
        int occur = args.length == 2 ? Integer.parseInt(args[1]) : 1;

        int min = 0, max = 0, slots = 0;
        int[][] arrayValues = getMinMaxSlotsValues().get(args[0].toUpperCase());

        int[] lotteryArray = new int[slots];
//        List<int[]> finalNumbers = new ArrayList<>();
        for (int p = 0; p < occur; p++) {
            for (int z = 0; z <= 1; z++) {
                slots = arrayValues[z][2];
                min = arrayValues[z][0];
                max = arrayValues[z][1];
                lotteryArray = new int[slots];
                boolean isRepeated;
                int randomNUmber = 0;
                for (int indexDrawn = 0; indexDrawn < slots; indexDrawn++) {
                    do {
                        isRepeated = false;
                        randomNUmber = rand.nextInt(max + 1 - min) + min;
                        for (int k = 0; k <= indexDrawn; k++) {
                            if (lotteryArray[k] == randomNUmber) {
                                isRepeated = true;
                                break;
                            }
                        }
                    } while (isRepeated);
                    lotteryArray[indexDrawn] = randomNUmber;
                }
                Arrays.sort(lotteryArray);
                System.out.println("Printing sorted array == " + p + "  " + Arrays.toString(lotteryArray));
//                finalNumbers.add(lotteryArray);
            }
        }
    }

    private static Map<String, int[][]> getMinMaxSlotsValues() {
        final Map<String, int[][]> lotteryDEfaultArray = new HashMap<>();
        lotteryDEfaultArray.put("EM", new int[][]{{1, 50, 5}, {1, 12, 2}});
        lotteryDEfaultArray.put("SFL", new int[][]{{1, 47, 5}, {1, 10, 1}});
        return lotteryDEfaultArray;
    }
}
