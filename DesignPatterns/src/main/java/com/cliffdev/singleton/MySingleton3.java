package com.cliffdev.singleton;

public class MySingleton3 {

    private static MySingleton3 instance ;

    static {
        instance = new MySingleton3();
    }
    private MySingleton3(){}

    public static MySingleton3 getInstance(){
        return instance;
    }
}
