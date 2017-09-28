package com.solar.java8.interf.def.impl;

import com.solar.java8.interf.def.FourWheeler;
import com.solar.java8.interf.def.Vehicle;

/**
 * Created by hushaoge on 2017/9/28.
 * 旅游巴士
 */
public class TouringBus implements Vehicle,FourWheeler {
    @Override
    public void print() {
        System.out.println("旅游巴士。。");
    }
}
