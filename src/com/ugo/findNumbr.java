package com.ugo;

public class findNumbr {
    public static void main(String[] args) {
    int [] nums = {23, 45, 1, 2, 8, 19,-3, 16, -11, 28};

        System.out.println(linearSearch(nums,109));

    }
    public static int linearSearch(int [] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++){
            int element = arr[i];
            if (element == target){
                return i;
            }
        }
        return -1;
    }
}
