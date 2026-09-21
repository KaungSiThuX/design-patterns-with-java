package com.kst.structural.decorator;

public class BasicLogger implements Logger
{
    @Override
    public String log(String message)
    {
        return message;
    }
}
