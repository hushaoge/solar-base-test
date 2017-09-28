package com.solar.java8.date.zone;

import java.time.ZoneId;

/**
 * Created by hushaoge on 2017/9/28.
 */
public class JV8ZoneId {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        System.out.println(zoneId);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println(currentZone);

    }
}
