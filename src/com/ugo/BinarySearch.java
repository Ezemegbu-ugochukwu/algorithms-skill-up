package com.ugo;

public class BinarySearch {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6};
        System.out.println(binarySearch(num, 4));
    }
    public static int binarySearch(int [] num, int target){
      int left = 0;
      int right = num.length -1;
      while (left <= right){
          int mid  = (left + right) /2;
          if (num[mid] == target){
              return mid;
          }else if (num[mid] > target){
              right = mid - 1;
          }else if (num[mid] < target){
              left = mid + 1;
          }
      }
      return left;
    }
}
