package com.ugo;

import java.util.Random;

public class GenerateRandomNumb {

    public static void main(String[] args) {
        System.out.println(generateRandom(14));
    }
    public static long generateRandom(int length) {
        Random random = new Random();
        char[] digits = new char[length];
        digits[0] = (char) (random.nextInt(9) + '1');
        for (int i = 1; i < length; i++) {
            digits[i] = (char) (random.nextInt(10) + '0');
        }
        return Long.parseLong(new String(digits));
    }
}
