package com.solar.java8.interf.def;

/**
 * Created by hushaoge on 2017/9/28.
 * 四轮车
 */
public interface FourWheeler {
    default void print(){
        System.out.println("这是一个四轮车。。");
    }

}
