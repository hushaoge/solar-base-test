package com.solar.java8.functions.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by hushaoge on 2017/9/18.
 */
public class PredicateTest1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // 传递参数 n
        eval(list, n -> n > 5);
        eval(list, n -> n % 2 == 0);
        eval(list, n -> n / 2 > 2);
    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer n: list) {
            if(predicate.test(n)) {
                System.out.println(n + " ");
            }
        }
    }
}
