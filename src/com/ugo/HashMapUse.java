//package com.ugo;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class HashMapUse {
//
//
//    public static void main(String[] args) {
//
//        HashMap<String, Integer> map = new HashMap<>();
//
//        map.put("apple", 1);
//        map.put("orange", 2);
//        map.put("mangoes", 3);
//
//        System.out.println(map);
//        System.out.println(map.get("orange"));
//
//        if (map.containsKey("orange")) {
//            System.out.println("it is present");
//        } else {
//            System.out.println("it is not present");
//        }
//
//        map.remove("apple");
//
//        System.out.println(map);
//
//        for (String key : map.keySet()){
//            System.out.println(key +":" + map.get(key));
//        }
//
//        for (Map.entry<String,Integer> e : Map.entrySet())
//
//    }
//}