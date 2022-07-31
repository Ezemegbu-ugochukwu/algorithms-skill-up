package com.ugo;

import java.util.Arrays;

public class FirstAndLastPositionBinarySearch {
    public static void main(String[] args) {
    int [] num = {5,7,7,8,8,10};
    int target = 8;
        int [] num1 = {5,7,7,8,8,10};
        int target1 = 6;
        System.out.println(Arrays.toString(searchRange(num,target)));
        System.out.println(Arrays.toString(searchRange(num1,target1)));
    }
    public static int [] searchRange(int [] num, int target) {
     int [] ans = {-1, -1};
     int start = search(num, target, true);
     int end = search(num, target, false);

     ans[0] = start;
     ans[1] = end;

     return ans;
    }
    public static int search(int [] num, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = num.length-1;

        while (start <= end){
            int mid  = start + (end - start)/2;
             if (num[mid] > target){
                end = mid - 1;
            }else if (num[mid] < target){
                start = mid + 1;
            }else {
               ans = mid;
               if (findStartIndex){
                   end = mid - 1;
               }else {
                   start = mid + 1;
               }
             }
        }
        return ans;
    }
}
