package com.solar.java8.date.time;

import java.time.LocalTime;

/**
 * Created by hushaoge on 2017/9/28.
 */
public class JV8Time {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(22, 15);
        System.out.println(localTime);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        int hour = currentTime.getHour();
        System.out.println(hour);
    }
}
