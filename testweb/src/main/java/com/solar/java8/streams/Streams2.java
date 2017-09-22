package com.solar.java8.streams;

import com.google.common.collect.Lists;

/**
 * Created by hushaoge on 2017/9/21.
 */
public class Streams2 {
    public static void main(String[] args) {
        Lists.newArrayList("1","2","33","43","22").stream().filter(p ->p.contains("3")).forEach(System.out::println);

        /**去重*/
        Lists.newArrayList("1","1","33","43","22").stream().distinct().forEach(System.out::println);
        /**取前N个*/
        Lists.newArrayList("1","1","33","43","22").stream().limit(3).forEach(System.out::println);
        /**跳过前N个*/
        Lists.newArrayList("1","1","33","43","22").stream().skip(3).forEach(System.out::println);
        /**取第一个*/
        Lists.newArrayList("1","1","33","43","22").stream().findFirst().ifPresent(System.out::println);
        /**取任何一个*/
        Lists.newArrayList("1","1","33","43","22").stream().findAny().ifPresent(System.out::println);

        System.out.println(Lists.newArrayList("1","1","33","43","22").stream().allMatch(p -> p.length()>1));

    }
}
