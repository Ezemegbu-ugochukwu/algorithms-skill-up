package com.ugo;

public class findANumberSmallerOrEqualToTarget {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 7};
        System.out.println(findANumberSmallerOrEqualToTarget(num, 6));
    }
 //floor = greatest number smaller or equal to 15
    public static int findANumberSmallerOrEqualToTarget(int[] num, int target) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (num[mid] == target) {
                return mid;
            } else if (num[mid] > target) {
                end = mid - 1;
            } else if (num[mid] < target) {
                start = mid + 1;
            }
        }
        return num[end];
    }
}