package com.ugo;

public class findANumberGreaterOrEqualToTargetBinarySearch {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,7};
        System.out.println(findANumberGreaterOrEqualToTarget(num, 8));
    }
    //ceil == greatest number greater or equal to target
    public static int findANumberGreaterOrEqualToTarget(int [] num, int target) {
        if (target > num.length-1){
            return -1;
        }
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
        return num[start];
    }
    }

