package com.kst.creational.factory;

public class MySQLConnectionFactory implements ConnectionFactory
{

    @Override
    public Connection createConnection()
    {
        return new MySQLConnection();
    }
}
