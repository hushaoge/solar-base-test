package com.solar.java8.functions.function;

import java.util.function.Function;

/**
 * Created by hushaoge on 2017/9/18.
 */
public class FunctionTest2 {
    public static void main(String[] args) {
        Function<String, Integer> function = t -> Integer.valueOf(t);
        Integer i = function.apply("1");
        /**Boolean->String->Integer*/
        Function<Boolean, Integer> booleanFunction = function.compose(t -> t? "1": "0");
        System.out.println(booleanFunction.apply(Boolean.TRUE));

        /**String->Integer->Boolean*/
        Function<String, Boolean> integerFunction = function.andThen(t -> t > 0);
        System.out.println(integerFunction.apply("1"));

    }
}
