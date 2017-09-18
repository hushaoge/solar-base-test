package com.solar.java8.functions.function;

import java.util.function.Function;

/**
 * Created by hushaoge on 2017/9/18.
 */
public class FunctionTest1 {
    public static void main(String[] args) {
        Function<String, Integer> function = t -> t == null ? Integer.valueOf(0) : Integer.valueOf(t);
        Integer i = function.apply("1");

        Function f = Function.identity();
        /**等价上述*/
        /**Function f = t -> t;*/

    }
}
