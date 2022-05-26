package com.ugo;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedChar {
    public static void main(String[] args) {
        System.out.println(findFirstNonRepeatedChar("success"));
    }
    public static Character findFirstNonRepeatedChar(String str){
        Map<Character,Integer> checker = new HashMap<>();
        for (int i = 0; i < str.length(); i++){
          char c = str.charAt(i);
          if (checker.containsKey(c)){
              checker.put(c, checker.get(c)+1);
          }else{
              checker.put(c,1);
          }
        }
        for (Map.Entry<Character, Integer> e : checker.entrySet()){
            if (e.getValue() == 1){
                return e.getKey();
            }
        }
      return null;
    }
}
