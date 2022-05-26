package com.ugo;

import java.util.HashMap;

public class DuplicateChar {
    public static void main(String[] args) {
        System.out.println(findDuplicateChar("ugochukwuuu"));
    }
    public static int findDuplicateChar(String str){
        HashMap<Character,Integer> checker = new HashMap<>();
        for (int i = 0; i < str.length(); i++){
          char c = str.charAt(i);
          if (checker.containsKey(c)){
              checker.put(c, checker.get(c)+1);
          }else {
              checker.put(c,1);
          }
        }
        for(Character c : checker.keySet()){
            if (checker.get(c) > 1){
                return checker.get(c);
            }
        }
        return 0;
    }
}
