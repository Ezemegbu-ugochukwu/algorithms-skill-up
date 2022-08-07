package com.ugo;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
     int [] arr = {32,7,-4,9,3,10};
     selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int [] arr){
        for (int i = 0; i < arr.length; i++){
            int lastIndex = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }

    static void swap(int[] arr, int maxIndex, int lastIndex) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int lastIndex) {
        int max = start;
        for (int i = start; i <= lastIndex; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
