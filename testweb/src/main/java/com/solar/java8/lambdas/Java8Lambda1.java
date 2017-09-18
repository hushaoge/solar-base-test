package com.solar.java8.lambdas;

/**
 * Created by hushaoge on 2017/9/18.
 */
public class Java8Lambda1 {
    public static void main(String[] args) {
        Func1 func1 = message -> System.out.println(message+ " Hello");
        func1.sayHello("1234567");
        Func2 func2 = System.out :: println;
        func2.sayHello("asj");
    }

    interface Func1 {
       void sayHello(String message);
    }

    interface Func2 {
        void sayHello(String message);
    }
}
