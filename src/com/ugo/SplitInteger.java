package com.ugo;

import java.util.ArrayList;
import java.util.List;

public class SplitInteger {
    public static void main(String[] args) {
        System.out.println(splitInteger(18,6));
    }
    public static List<Integer> splitInteger(Integer num, Integer parts) {
        List<Integer> list = new ArrayList<>();
        while (parts > 0) {
            int n = Math.floorDiv(num,parts);
            list.add(n);
            num -= n;
            parts--;
        }
        return list;
    }
}
