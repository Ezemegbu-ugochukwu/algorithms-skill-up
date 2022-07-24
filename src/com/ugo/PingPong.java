package com.ugo;

import java.util.HashMap;
import java.util.*;

public class PingPong {
    public static void main(String[] args) {
        System.out.println(pingPong("ping-pong-ping-pong-ping-pong-ping-pong-ping-dong-tang-bing-tink-donk-donk-donk"));
    }
    public static String pingPong(String sounds) {
//        String result = "";
        Map<String, Integer> map = new HashMap<>();
        map.put("ping", 0);
        map.put("pong", 0);

        var arr = sounds.split("-");
        String serving = arr[0];
        List<List<String>> listOfGames = new ArrayList<>();
        List<String> lists = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(!arr[i].equals("pong") && !arr[i].equals("ping")){
                System.out.println(lists);
                listOfGames.add(listOfGames.size(), lists);
                lists = new ArrayList<>();
            }
            else {
                lists.add(arr[i]);
            }

        }
        System.out.println(listOfGames);
        return "";
    }
}
