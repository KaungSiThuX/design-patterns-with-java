package com.kst.creational.singleton;

public class SingletonDemo
{
    static void main()
    {
        Singleton singleton1 = Singleton.getInstance();

        Singleton singleton2 = Singleton.getInstance();

        System.out.println("singleton 1 is " + singleton1);
        System.out.println("singleton 2 is " + singleton2);
        System.out.println("singleton 1 == singleton 2 " + (singleton1 == singleton2));
    }
}
