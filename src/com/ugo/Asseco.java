package com.ugo;

import java.util.HashMap;
import java.util.Map;

public class Asseco {
    public static void main(String[] args) {
//        class A {
//            protected void doSmth() {
//                System.out.println("do smth A");
//            }
//            protected void doSmthElse() {
//                System.out.println("do smth else A");
//            }
//
//        }
//        class B extends A {
//
//
//            protected void doSmth() {
//                System.out.println("Do smth B");
//            }
//            protected void doSmthElse(int i){
//                System.out.println("do smth else B");
//            }
//        }
//        A ref = new B();
//
//        ref.doSmth();
//        ref.doSmthElse();


    }
    public static int numSplits(String s) {
        Map<Character, Integer> result1 = new HashMap<Character, Integer>();
        Map<Character, Integer> result2 = new HashMap<Character, Integer>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            int count = result2.getOrDefault(c, 0) + 1;
            result2.put(c, count);
        }
        int split = 0;
        for (int i = 0; i < length - 1; i++) {
            char c = s.charAt(i);
            int count1 = result1.getOrDefault(c, 0) + 1;
            result1.put(c, count1);
            int count2 = result2.get(c) - 1;
            if (count2 > 0)
                result2.put(c, count2);
            else
                result2.remove(c);
            if (result1.size() == result2.size())
                split++;
            else if (result1.size() > result2.size())
                break;
        }
        return split;

    }

}
