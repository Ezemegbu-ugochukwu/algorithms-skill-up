package com.ugo;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
       missingNumber(new int []{7,3,6,1,4,2});
    }
    public static int missingNumber (int [] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++){
            if (arr[i + 1] - arr[i] > 1){
                System.out.println(arr[i] + 1);
            }
        }

        return 0;
    }
}
