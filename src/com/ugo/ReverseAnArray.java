package com.ugo;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(new int[]{3, 4, 5, 6, 7, 8})));
    }

    public static int[] reverse(int[] arr){

        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }
}
//{3,4,5,6,7,8,9}