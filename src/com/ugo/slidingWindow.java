package com.ugo;

import java.util.Arrays;

public class slidingWindow {
    public static void main(String[] args) {
      double[] result =  findAverages(5, new int[] {1, 3, 2, 6, -1, 4, 1, 8, 2 });
        System.out.println(Arrays.toString(result));
    }
    public static double[] findAverages(int k, int[] arr) {
     double [] result = new double[k];

     double windowSum = 0;
     int windowStart = 0;
     for (int i=0; i<arr.length; i++){
      windowSum += arr[i];

      if (i >= k-1){
         result[windowStart] = windowSum/k;
         windowSum -= arr[windowStart];
         windowStart++;
      }
     }
     return result;
    }
}
