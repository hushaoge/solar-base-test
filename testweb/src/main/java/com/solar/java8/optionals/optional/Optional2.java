package com.solar.java8.optionals.optional;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Optional;

/**
 * Created by hushaoge on 2017/9/20.
 */
public class Optional2 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable("");
        System.out.println(optional.filter(t -> t.length()>1).isPresent());

        List<Optional<String>> l = Lists.newArrayList(Optional.ofNullable("String"),Optional.ofNullable("Integer"),Optional.ofNullable("Long"),Optional.ofNullable("Double"),Optional.ofNullable("Float"),Optional.ofNullable("Short"),Optional.ofNullable("Boolean"),Optional.ofNullable("Byte"));
        l.forEach(c -> {
//            System.out.println(opl.orElseGet(() -> "length <= 5"));
            System.out.println(c.filter(cc -> cc.length() > 5).orElse("length <= 5"));
        });
        l.forEach(c -> c.filter(cc -> cc.length() > 5).ifPresent(System.out :: println));
        /**比较*/
        List<String> ll = Lists.newArrayList("String","Integer","Long","Double","Float","Short", "Byte");
        for (String s : ll) if(s != null && s.length() > 5) System.out.println(s);
    }
}
