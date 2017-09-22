package com.solar.java8.streams;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by hushaoge on 2017/9/21.
 */
public class Streams3 {
    public static void main(String[] args) {
        /**归约*/
        /**求和*/
        List<Integer> list = Lists.newArrayList(1,2,3,4,5,6,7,8,9,10);
        int sum = list.stream().reduce(0, (i1,i2)->i1+i2);
        System.out.println(sum);
        sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);
        /**装箱、拆箱操作效率较低，提供IntStream、DoubleStream、LongStream*/
    }
}
