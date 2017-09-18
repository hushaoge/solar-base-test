package com.solar.java8.functions.function;

import java.util.function.Function;

/**
 * Created by hushaoge on 2017/9/18.
 */
public class FunctionTest2 {
    public static void main(String[] args) {
        Function<String, Integer> function = t -> Integer.valueOf(t);
        //function.compose(t -> t >2);
    }
}
