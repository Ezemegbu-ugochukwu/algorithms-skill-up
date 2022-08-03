package com.ugo;

public class MountainArrayHard {
    public static void main(String[] args) {
   // int [] arr = [1,2,3,4,5,3,1]   target = 3
        //ans 2 and 4 but will return index 2 cos its the minimum
//        1. find peak element = 5
//        2. binary search in LHS array (0,4)
//        3. if not found binary search in the RHS (5,6)


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
