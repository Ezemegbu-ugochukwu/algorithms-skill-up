package com.ugo;

import java.time.LocalDate;

public class removehyphenfromdate {
    public static void main(String[] args) {
//        System.out.println(getDate());
        System.out.println(removeHyphen(LocalDate.parse("2022-12-14")));
    }

    //    public static LocalDate getDate() {
//        return LocalDate.now();
//    }
//
    public static String removeHyphen(LocalDate x) {
        String ugo = x.toString();
        String a = ugo.replaceAll("-", "");
        return a;
    }
}
//       String [] stringUgo = ugo.split("_");
//        return stringUgo;
//    }


