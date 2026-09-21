package com.kst.creational.factory;

public class MySQLConnection implements Connection
{
    @Override
    public void open()
    {
        System.out.println("my sql connection open");
    }

    @Override
    public void close()
    {
        System.out.println("my sql connection close");
    }
}
