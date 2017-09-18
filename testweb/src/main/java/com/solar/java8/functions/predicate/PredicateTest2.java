package com.solar.java8.functions.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by hushaoge on 2017/9/18.
 */
public class PredicateTest2 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // 传递参数 n
        eval(list, n -> n % 2 == 0);

        Predicate<Integer> predicate = n -> true;
        /**Predicate中的and与下面的定义一样*/
        Predicate<Integer> predicate2 = n -> predicate.test(n) && n < 2;
        System.out.println(predicate2.test(1));
        System.out.println(predicate.and(n -> n <2).test(1));
        /***or,negate与上述and类似*/
        System.out.println(predicate.or(n -> n > 2).test(1));
        System.out.println(predicate.negate().test(1));

        Predicate<String> equal = Predicate.isEqual("2");
        System.out.println(equal.test("1"));
        /**Predicate.isEqual("2")等价于*/
        Predicate<String> equal2 = s -> s == null ? false : "2".equals(s);
        System.out.println(equal.test("1"));

    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer n: list) {
            if(predicate.and(m -> m >2).test(n)) {
                System.out.println(n + " ");
            }
        }
    }
}
