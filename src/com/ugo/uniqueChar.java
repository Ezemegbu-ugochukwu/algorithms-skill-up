package com.ugo;

import java.util.HashSet;

public class uniqueChar {
    public static void main(String[] args) {
        System.out.println(uniqueCharacter("ughog"));
    }
    public static boolean uniqueCharacter(String word){
        HashSet<Character> checker = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {
          char c = word.charAt(i);
          if (!checker.add(c)){
              return false;
          }
        }
        return true;
    }
}
