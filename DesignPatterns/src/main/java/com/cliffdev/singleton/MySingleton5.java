package com.cliffdev.singleton;

public class MySingleton5 {

    private MySingleton5(){}

    private static class MySingleton5Holder{
        private final static MySingleton5 instance = new MySingleton5();
    }
    public static MySingleton5 getInstance(){
         return MySingleton5Holder.instance;
    }
}
