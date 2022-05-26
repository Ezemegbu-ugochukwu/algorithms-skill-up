package com.ugo;

public class reverseString {
    public static void main(String[] args) {
        System.out.println(reverseWord("ugo"));
    }
    public static String reverseWord(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        return result;

   }
}
