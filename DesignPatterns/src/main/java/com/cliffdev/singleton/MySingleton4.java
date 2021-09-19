package com.cliffdev.singleton;

public class MySingleton4 {

    private static MySingleton4 instance ;

    private MySingleton4(){}

    public static MySingleton4 getInstance(){
        if(instance == null){
            synchronized (MySingleton4.class){
                instance = new MySingleton4();
            }
        }
        return instance;
    }
}
