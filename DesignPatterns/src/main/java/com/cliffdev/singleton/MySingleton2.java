package com.cliffdev.singleton;

public class MySingleton2 {

    private static MySingleton2 instance = new MySingleton2();

    private MySingleton2(){}

    public static  MySingleton2 getInstance(){
        return instance;
    }
}
