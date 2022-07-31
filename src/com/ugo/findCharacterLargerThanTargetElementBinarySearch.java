package com.ugo;

public class findCharacterLargerThanTargetElementBinarySearch {
    public static void main(String[] args) {
     char [] num = {'a', 'c', 'e', 'f', 'g'};
     char target = 'g';
        System.out.println(findCharacterLargerThanTargetElement(num, target));
    }
    //note arr = ['c', 'e', 'f', 'g']  target = g  ans = c
    public static char findCharacterLargerThanTargetElement (char [] num, int target) {

        int start = 0;
        int end = num.length -1;
        while (start <= end){
            int mid  = start + (end - start)/2;
            if (num[mid] > target){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return num[start % num.length];
    }
}
