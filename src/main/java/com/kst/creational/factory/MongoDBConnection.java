package com.kst.creational.factory;

public class MongoDBConnection implements Connection
{
    @Override
    public void open()
    {
        System.out.println("mongodb connection open");
    }

    @Override
    public void close()
    {
        System.out.println("mongodb connection close");
    }
}
