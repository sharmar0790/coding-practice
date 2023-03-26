package com.one7.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountingTriangles {

    // Add any helper functions you may need here
    public static void main(String[] args) {
        ArrayList<Sides> arr_1 = new ArrayList<>();
        arr_1.add(new Sides(7, 6, 5));
        arr_1.add(new Sides(5, 7, 6));
        arr_1.add(new Sides(8, 2, 9));
        arr_1.add(new Sides(2, 3, 4));
        arr_1.add(new Sides(2, 4, 3));
        System.out.println(countDistinctTriangles(arr_1));
    }

    private static int countDistinctTriangles(ArrayList<Sides> arr) {
        // Write your code here
        Set<String> stringSet = new HashSet<>();
        for (Sides sides : arr) {
            int[] temp = new int[]{sides.a, sides.b, sides.c};
            Arrays.sort(temp);
            stringSet.add("" + temp[0] + temp[1] + temp[2]);
        }
        return stringSet.size();
    }

    private static boolean checkEquality(Sides s1, Sides s2) {
        return (s1.a == s2.a || s1.a == s2.b || s1.a == s2.c) && (s1.b == s2.b || s1.b == s2.c || s1.b == s2.a) &&
                (s1.c == s2.c || s1.c == s2.b || s1.c == s2.a);
    }

}

class Sides {
    int a;
    int b;
    int c;

    Sides(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
