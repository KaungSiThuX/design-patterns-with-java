package com.kst.creational.singleton;

public class Singleton
{
    private static Singleton instance;

    public Singleton()
    {
        System.out.println("create singleton");
    }

    public static Singleton getInstance()
    {
        if (instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
}
