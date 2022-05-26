package com.ugo;

import java.util.Arrays;

public class MaxSumSubArrayOfSizeK {
    public static void main(String[] args) {
    int result = findMaxSumSubArray(3, new int[]{2, 1, 5, 8, 3, 2});
        System.out.println(result);
    }
    public static int findMaxSumSubArray(int k, int [] arr) {
        int windowSum = 0;
        int max = 0;
        int windowStart = 0;
     for (int i = 0; i < arr.length; i++){
         windowSum += arr[i];
         if (i >= k-1){
            max = Math.max(max, windowSum);
            windowSum -= arr[windowStart];
            windowStart++;
         }
    }
     return max;
    }
}
