package com.solar.java8.quote;

import java.util.function.Supplier;

/**
 * Created by hushaoge on 2017/9/18.
 */
public class Car {
    public static Car create(final Supplier<Car> supplier){
        return supplier.get();
    }
}
