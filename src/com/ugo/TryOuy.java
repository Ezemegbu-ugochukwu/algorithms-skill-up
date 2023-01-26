package com.ugo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class TryOuy {

    public static void main(String[] args) {
        String pattern = "yyyyMMddHHmm";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat.format(new Date()));

        String pattern1 = "yyyyMMddHHmmss";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(pattern1);
        System.out.println(simpleDateFormat1.format(new Date()));

        LocalDate valueDate = LocalDate.now();
        System.out.println(valueDate);

    }



}
