package com.cliffdev.singleton;

public class MySingleton1 {

    private static  MySingleton1 instance = null;

    private MySingleton1(){}

    public static synchronized MySingleton1 getInstance(){
        if(instance == null){
            instance = new MySingleton1();
        }
        return instance;
    }
}
