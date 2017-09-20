package com.solar.java8.optionals.optional;

import java.util.Optional;

/**
 * Created by hushaoge on 2017/9/20.
 */
public class Optional1 {
    public static void main(String[] args) {
        String t = "123456789";
//        String t = null;
//        Optional<String> optional = Optional.of(t);
        Optional<String> optional = Optional.ofNullable(t);
        if(optional.isPresent()){
            optional.get().length();
        }

        optional.ifPresent(v -> System.out.print(v.length()));

    }
}
