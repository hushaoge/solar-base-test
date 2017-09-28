package com.solar.java8.date.time;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

/**
 * Created by hushaoge on 2017/9/28.
 */
public class JV8DateTime {
    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println(currentTime);

        LocalDate localDate = currentTime.toLocalDate();
        System.out.println(localDate);

        int year =   currentTime.getYear();
        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        int second = currentTime.getSecond();
        System.out.println(StringUtils.join(year,"年",month.getValue(),"月",day,"日",hour,"点",minute,"分",second,"秒"));
    }
}
