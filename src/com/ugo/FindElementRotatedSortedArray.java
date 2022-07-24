//package com.ugo;
//
//public class FindElementRotatedSortedArray {
//    public static void main(String[] args) {
//
//    }
//    public  static  int findElementRotatedSortedArray(int[] arr,int low,int high,int number){
//        int mid;
//        while (low <= high){
//            mid = low + (high - low)/2;
//
//            if (arr[mid] == number){
//                return mid;
//            }else if (arr[mid] < number){
//                return low = mid + 1;
//            }else{
//                high = mid -1;
//            }
//        }
//        return
//    }
//}
