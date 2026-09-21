package com.kst.behavioral.observer;

public class Subscriber
{
    int id;

    public Subscriber(int id)
    {
        this.id = id;
    }

    void handle(String message)
    {
        System.out.println("subscriber " + id + " got message " + message);
    }
}
