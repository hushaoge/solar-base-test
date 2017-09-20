package com.solar.java8.functions.supplier;

import java.util.function.Supplier;

/**
 * Created by hushaoge on 2017/9/20.
 */
public class Supplier1 {
    public static void main(String[] args) {
        Supplier<String> supplier = ()-> new String();
        Supplier<String> supplier_ = String :: new;
        String a = supplier.get();
    }
}
