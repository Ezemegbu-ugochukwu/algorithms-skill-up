package com.ugo;

import java.util.ArrayList;
import java.util.List;

public class steps {
    public static void main(String[] args) {
        System.out.println(steps("Accommodation","3"));
        System.out.println(steps("Coderbyte","3"));
        System.out.println(steps("Impersonation","3"));
        System.out.println(steps("Television","4"));
        System.out.println(steps("Hacker","5"));
        System.out.println(steps("Good","1"));
    }
   public static String steps(String input, String steps){
        int stepsInt = Integer.parseInt(steps);
        if (stepsInt > 1){
        List<String> list = new ArrayList<>();
        String result = "";
        int lowPoint = 0;
        int highpoint = stepsInt-1;
        int highAndLow = 0;
        boolean peak = true;
        // from zero, set the item in the list at the same index as the current value of steps
        // when it gets to high point or low point negate bool and continue till the last character in the string
        for (int i = 0; i < stepsInt; i++) {
            list.add("");
        }
        for (int i = 0; i < input.length(); i++) {
            list.set(highAndLow, (list.get(highAndLow) + input.charAt(i)));
            if (peak == false) {
                highAndLow--;
            } else{
                highAndLow ++;
            }
            if (highAndLow == highpoint || highAndLow == lowPoint) {
                peak = !peak;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
        }
        return result;
        }
        return input;
    }
}
