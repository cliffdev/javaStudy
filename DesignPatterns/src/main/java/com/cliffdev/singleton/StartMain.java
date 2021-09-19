package com.cliffdev.singleton;

public class StartMain {
    public static void main(String[] args) {
       // test1();
        test5();
    }
    public static void test1(){
        MySingleton1 m1 = MySingleton1.getInstance();
        MySingleton1 m2 = MySingleton1.getInstance();
        System.out.println(m1 ==m2 );
    }

    public static void test2(){
        MySingleton2 m1 = MySingleton2.getInstance();
        MySingleton2 m2 = MySingleton2.getInstance();
        System.out.println(m1 ==m2 );
    }

    public static void test5(){
        MySingleton5 m1 = MySingleton5.getInstance();
        MySingleton5 m2 = MySingleton5.getInstance();
        System.out.println(m1 ==m2 );
    }
}
