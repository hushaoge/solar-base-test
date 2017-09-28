package com.solar.java8.interf.def;

/**
 * Created by hushaoge on 2017/9/28.
 * 公共汽车
 */
public interface Bus extends Vehicle,FourWheeler {
    @Override
    default void print() {
        System.out.println("公共汽车。。");
    }
}
