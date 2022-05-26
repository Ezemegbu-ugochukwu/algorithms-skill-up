package com.ugo;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(checkAnagram("angel", "anglle"));
    }
    public static boolean checkAnagram(String word, String anagram) {
        if (word.length() != anagram.length()){
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
          char c =  word.charAt(i);
          if (anagram.indexOf(c) != -1){
              return true;
          }
        }
        return false;
    }
}
