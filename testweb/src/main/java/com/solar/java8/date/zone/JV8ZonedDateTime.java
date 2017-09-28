package com.solar.java8.date.zone;

import java.time.ZonedDateTime;

/**
 * Created by hushaoge on 2017/9/28.
 */
public class JV8ZonedDateTime {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        ZonedDateTime zoned = ZonedDateTime.parse("2017-09-28T16:38:47.966+08:00[Asia/Shanghai]");
        System.out.println(zoned);
    }
}
