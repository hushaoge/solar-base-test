package com.solar.java8.functions.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by hushaoge on 2017/9/20.
 */
public class Consumer1 {
    public static void main(String[] args) {
        Consumer<List<String>> consumer = t -> {
            if(t != null) {
                t.add("defualt");
            }
        };
        List<String> l = new ArrayList<>();
        consumer.accept(l);
        System.out.println(l);
    }
}
