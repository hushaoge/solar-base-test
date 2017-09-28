package com.solar.java8.interf.def;

/**
 * Created by hushaoge on 2017/9/28.
 * 车辆
 */
public interface Vehicle {
    default void print(){
        System.out.println("这是什么车？");
    }

    static void blowHorn(){
        System.out.println("按喇叭!!!");
    }
}
