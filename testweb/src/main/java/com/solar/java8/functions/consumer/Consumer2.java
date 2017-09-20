package com.solar.java8.functions.consumer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by hushaoge on 2017/9/20.
 */
public class Consumer2 {
    public static void main(String[] args) {
        Consumer<List<String>> consumer = t -> {
            if(t != null) {
                t.add("defualt");
            }
        };

       /* Consumer<List<String>> consumer2 = consumer.andThen(t -> {
            t.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    System.out.println(o1+","+o2);
                    if(o1.length() > o2.length()){
                        return 1;
                    }else {
                        return -1;
                    }
                }
            });
            System.out.println(t);
        });*/
        Consumer<List<String>> consumer2 = consumer.andThen(t -> t.sort((t1,t2) -> {
                if(t1.length() > t2.length()){
                    return 1;
                }else{
                    return -1;
                }
            })
        );
        List<String> l = new ArrayList<>();
        consumer2.accept(l);
        System.out.println(l);
    }
}
