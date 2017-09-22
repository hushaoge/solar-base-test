package com.solar.java8.streams;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by hushaoge on 2017/9/21.
 */
public class Streams4 {
    public static void main(String[] args) {
        /**装箱、拆箱操作效率较低，提供IntStream、DoubleStream、LongStream*/
        List<Integer> list = Lists.newArrayList(1,2,3,4,5,6,7,8,9,10);
        int sum = list.stream().mapToInt(f->f.intValue()).reduce(0, (i1, i2)->i1+i2);
        System.out.println(sum);

        /**最大值*/
        list.stream().mapToInt(f->f.intValue()).max().ifPresent(System.out::println);
        /**最小值*/
        list.stream().mapToInt(f->f.intValue()).min().ifPresent(System.out::println);
    }
}
