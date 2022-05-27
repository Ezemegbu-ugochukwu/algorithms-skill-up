package com.ugo;

public class findSmallestNumb {
    public static void main(String[] args) {
        System.out.println(smallestNumb(new int[] {12,9,56,76,89,100,343,21,234}));
    }
    public static int smallestNumb(int[] arr){
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }
}

