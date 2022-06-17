package com.ugo;

public class highAndLow {
    public static void main(String[] args) {
        String[] number = {"1 2 3 4 5"};
        System.out.println(highAndLow("12345"));
    }

    public static String highAndLow(String numbers) {
        String result;
        String[] nums = numbers.split("");
        System.out.println(nums);
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (Integer.parseInt(nums[i]) < minVal){
                minVal = Integer.parseInt(nums[i]);
            }else {
                if (Integer.parseInt(nums[i]) > maxVal){
                    maxVal = Integer.parseInt(nums[i]);
                }
            }
        }
        return maxVal+ " "+minVal;
    }
}


