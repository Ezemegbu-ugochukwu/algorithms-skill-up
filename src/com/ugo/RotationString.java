package com.ugo;

public class RotationString {
    public static void main(String[] args) {
        System.out.println(isRotation("java2blog","blogjava2"));
        System.out.println(isRotation("java2blog", "avablog2j"));
    }
    public static boolean isRotation(String str1, String str2){
        String str3 = str1 + str1;
        if (str3.contains(str2)){
            return true;
        }
        return false;
    }
}
