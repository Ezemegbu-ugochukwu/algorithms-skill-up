package com.ugo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fjfjfjfjf {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>(Arrays.asList(4,6,8,1,5,9,0,3));
        System.out.println(sum(num, 9));
    }

    static List<List<Integer>> sum(List<Integer> nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) == target) {
                    temp.add(nums.get(i));
                    temp.add(nums.get(j));
                }
            }
            result.add(temp);
        }
        return result;
    }
}
