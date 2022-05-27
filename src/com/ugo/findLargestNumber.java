package com.ugo;

public class findLargestNumber {
    public static void main(String[] args) {
        System.out.println(largestNumber(new int[] {12,56,76,89,550,100,343,21,234}));
    }
    public static int largestNumber (int [] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {

         if (arr[i] > largest){
             largest = arr[i];
         }
        }
        return largest;
    }
}
