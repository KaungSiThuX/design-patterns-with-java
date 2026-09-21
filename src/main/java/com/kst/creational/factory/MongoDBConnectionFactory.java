package com.kst.creational.factory;

public class MongoDBConnectionFactory implements ConnectionFactory
{
    @Override
    public Connection createConnection()
    {
        return new MongoDBConnection();
    }
}
