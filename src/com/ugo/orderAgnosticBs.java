package com.ugo;

public class orderAgnosticBs {
    public static void main(String[] args) {
        int [] num = new int[]{10,8,6,4,2,1}; //descending order different logic
        int target = 1;
        System.out.println(orderAgnosticBS(num, target));
    }
    public static int orderAgnosticBS(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;

        //check if the sorted array is in ascending or descending order

//        if (arr[0] < arr[end]){
//            System.out.println("ascending form");
//        }else
//            System.out.println("descending form");
//        return start;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (target == arr[mid]){
                return mid;
            }else if (target < arr[mid]){
                start = mid + 1;
            }
            else if (target > arr[mid] ){
                end = mid - 1;
            }
        }
        return -1;
    }
}
