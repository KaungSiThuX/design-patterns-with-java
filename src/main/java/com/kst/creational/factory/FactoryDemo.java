package com.kst.creational.factory;

public class FactoryDemo
{
    static void main()
    {
        ConnectionFactory connectionFactory = new MySQLConnectionFactory();
        Connection connection = connectionFactory.createConnection();

        connection.open();
        connection.close();
    }
}
