package com.kst.creational.factory;

public class PostgresConnection implements Connection
{
    @Override
    public void open()
    {
        System.out.println("postgres connection open");
    }

    @Override
    public void close()
    {
        System.out.println("postgres connection close");
    }
}
