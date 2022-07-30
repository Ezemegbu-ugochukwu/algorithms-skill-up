package com.ugo;

public class BinarySearch {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6};
        System.out.println(binarySearch(num, 1));
    }
    public static int binarySearch(int [] num, int target){
      int start = 0;
      int end = num.length -1;
      while (start <= end){
          int mid  = start + (end - start)/2;
          if (num[mid] == target){
              return mid;
          }else if (num[mid] > target){
              end = mid - 1;
          }else if (num[mid] < target){
              start = mid + 1;
          }
      }
      return -1;
    }
}
