package com.solar.java8.interf.def.impl;

import com.solar.java8.interf.def.FourWheeler;
import com.solar.java8.interf.def.Vehicle;

/**
 * Created by hushaoge on 2017/9/28.
 */
public class Car implements Vehicle, FourWheeler {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.print();
    }
    @Override
    public void print() {
        Vehicle.super.print();
        FourWheeler.super.print();
        Vehicle.blowHorn();
        System.out.println("This is a car!");
    }

}
