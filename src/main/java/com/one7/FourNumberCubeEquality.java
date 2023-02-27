package com.one7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Math.pow;

public class FourNumberCubeEquality {

    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    private static boolean solution(int n) {
        System.out.println("Range of numbers :::" + n);

        Map<Integer, List<Pair>> pairMap = new HashMap<Integer, List<Pair>>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int lsum = (int) (pow(i, 3) + pow(j, 3));

                if (pairMap.containsKey(lsum)) {
                    Pair p1 = new Pair(i, j);
                    List<Pair> pairList = pairMap.get(lsum);
                    pairList.add(p1);
                    pairMap.put(lsum, pairList);
                } else {
                    Pair p = new Pair(i, j);
                    List<Pair> pairList = new ArrayList<>();
                    pairList.add(p);
                    pairMap.put(lsum, pairList);
                }
            }
        }

        for (int c = 0; c < n; c++) {
            for (int d = 0; d < n; d++) {
                int rsum = (int) (pow(c, 3) + pow(d, 3));
                if (pairMap.containsKey(rsum)) {
                    System.out.println(pairMap.get(rsum).toString());
                }
            }

        }


        return false;
    }
}

class Pair {
    int num1;
    int num2;

    public Pair(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
