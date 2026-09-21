package com.kst.creational.factory;

public class PostgresConnectionFactory implements ConnectionFactory
{
    @Override
    public Connection createConnection()
    {
        return new PostgresConnection();
    }
}
