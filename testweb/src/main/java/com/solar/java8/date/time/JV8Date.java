package com.solar.java8.date.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

/**
 * Created by hushaoge on 2017/9/28.
 */
public class JV8Date {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalDateTime localDateTime = currentDate.atStartOfDay();
        System.out.println(localDateTime);

        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek.getValue());

        LocalDateTime localDateTime1 = currentDate.atTime(16, 11);
        System.out.println(localDateTime1);

        LocalDate localDate = LocalDate.of(2017, Month.JANUARY, 16);
        System.out.println(localDate);
    }
}
