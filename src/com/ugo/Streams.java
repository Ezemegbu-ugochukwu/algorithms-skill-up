package com.ugo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streams {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("ben","ugo","charles","mark");
//        names.stream().map(String::toUpperCase).forEach(System.out::println);
        names.stream().sorted().forEach(System.out::println);

//        System.out.println(convertFromLocalDateTimeToLocalDate(2022-10-14 T 11:17:26.126));
    }

    public static LocalDate convertFromLocalDateTimeToLocalDate(LocalDateTime date){

        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.from(date));

        return localDateTime.toLocalDate();
    }
}
