package com.solar.java8.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * Created by hushaoge on 2017/9/28.
 */
public class ZonedTime {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Europe/Paris");

        LocalDateTime europeTime = LocalDateTime.now(zoneId);
        System.out.println(europeTime);

        LocalDate europeDate = LocalDate.now(zoneId);
        System.out.println(europeDate);
    }
}
