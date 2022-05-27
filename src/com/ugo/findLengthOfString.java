package com.ugo;

public class findLengthOfString {
    public static void main(String[] args) {
        System.out.println(findLengthOfStrings("ugpchukwuu"));
    }
    public static int findLengthOfStrings(String str){
        int length = 0;
        char[] charArray =  str.toCharArray();
        for (char c : charArray){
            length++;
        }
        return length;
    }
}
