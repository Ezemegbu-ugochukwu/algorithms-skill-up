package com.ugo;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
     int [] [] arr = new int[][]{
             {23, 4, 1},
             {18, 12, 3, 9},
             {78, 99 , 34, 56}
     };
        System.out.println(Arrays.toString(search(arr, 9)));
    }
    public static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
