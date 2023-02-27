package com.one7;

public class RotationCipher {

    public static void main(String[] args) {
        System.out.println(solution("Zebra-493?", 3));
    }

    public static String solution(String input, int rotationFactor) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                char ch = (char) (((int) input.charAt(i) +
                        rotationFactor - 65) % 26 + 65);
                result.append(ch);
            } else if (Character.isLowerCase(input.charAt(i))) {
                char ch = (char) (((int) input.charAt(i) +
                        rotationFactor - 97) % 26 + 97);
                result.append(ch);
            } else if (Character.isDigit(input.charAt(i))) {
                int ch = (Character.getNumericValue(input.charAt(i)) + rotationFactor) % 10;

                result.append(ch);
            } else {
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }

}

