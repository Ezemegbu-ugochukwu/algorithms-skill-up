package com.ugo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Binary {
    public static void main(String[] args) {
        System.out.println(arrayPacking(Arrays.asList(24,85,7)));
    }
    public static int arrayPacking(List<Integer> integers) {

        Collections.reverse(integers);
//        System.out.println(integers);
        int result = 0;
        String str = "";
        for (int i = 0; i < integers.size(); i++) {

         //   Integer integer = integers.get(i);
//            System.out.println("ans" + integers.get(i));
            String str1 = Integer.toBinaryString(integers.get(i)); //returns a string
            if (str1.length() < 8){
                int remainder = 8 - str1.length();
                String zero = "0".repeat(remainder);
                System.out.println("ans" + zero);
                str1 = zero.concat(str1);
                System.out.println(str1);
            }
            str += str1;
           result = Integer.parseInt(str,2);

        }

        return result;
    }
}
//    You are given an array of up to four non-negative integers, each less than 256.
//
//        Your task is to pack these integers into one number M so that the first element of the array occupies the first (or least significant) 8 bits of M; the second element occupies next 8 bits, and so on.
//
//        Return the obtained integer M as unsigned integer.
//
//        Note
//        As indicated the first 8 bits are the least significant bits of M, meaning the right-most bits of the integer.
//        For further clarification see the following example.
//
//        Specification
//        Challenge.arrayPacking(array)
//        Parameters
//        array: List<Integer> - up to four unsigned integers
//
//        Return Value
//        Integer - an unsigned integer
//
//        Constraints
//        array.length == 3
//
//        0 ≤ array[i] < 256