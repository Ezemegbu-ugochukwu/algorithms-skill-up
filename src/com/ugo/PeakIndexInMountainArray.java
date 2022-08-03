package com.ugo;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
     //arr = [0,1,0] == 1
        //arr = [0,2,1,0] == 28
        int [] arr = {0,2,1,0};
        int [] arr1 = {0,2,5,6,7,8,1};
        System.out.println(mountainArray(arr));
        System.out.println(mountainArray(arr1));
    }
    public static int mountainArray(int [] arr){
       int start = 0;
       int end = arr.length-1;
       while (start < end){
           int mid = start + (end - start)/2;
           if (arr[mid] > arr[mid + 1]){
               end = mid;
           }else {
               start = mid + 1;
           }
       }
       return start;
    }
}
