package com.ugo;

public class searchInStrings {
    public static void main(String[] args) {
    String name = "ugochukwu";
        System.out.println(findAlpha(name, 'z'));
    }
    public static boolean findAlpha(String str, char target){
       char [] words = str.toCharArray();
       for (char word : words){
           if (word == target){
               return true;
           }
       }
       return false;
    }
}
