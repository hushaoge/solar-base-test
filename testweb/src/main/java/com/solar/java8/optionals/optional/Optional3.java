package com.solar.java8.optionals.optional;

import java.util.Optional;

/**
 * Created by hushaoge on 2017/9/20.
 */
public class Optional3 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable("1");
        Optional<Integer> opl = optional.map(f -> Integer.valueOf(f));
    }
}
