package com.ugo;

import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {
        System.out.println(hasUniqueChars("abcdefg"));
    }
    public static boolean hasUniqueChars(String str) {

       String [] strArray = str.split("");
      // List<String> list = Arrays.asList(strArray);
        List<String> list = Arrays.asList(strArray);
        Set<String> set = new HashSet<>(list);
        if (list.size() == set.size()){
            return true;
        }else {
            return false;
        }
    };
}


//Write a program to determine if a string contains all unique characters. Return true if it does and false otherwise.
//
//The string may contain any of the 128 ASCII characters.
