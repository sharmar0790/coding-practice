package com.one7;

public class OutputTesting {

    public static void main(String[] args) {
        int x = 5;
        System.out.println("x = 5  " + x);
        int y = x++;
        System.out.println("y = 5 && x = 6  " + x + "  " + y);
        int z = ++x;
        System.out.println("z==7 && x ==7 " + x + "  " + y);
        int result = x + y + z;
        System.out.println(result);
    }
}
