package com.kst.behavioral.mediator;

public class User implements ChatUser
{
    int id;

    public User(int id)
    {
        this.id = id;
    }

    @Override
    public void send(String message)
    {
        System.out.println("user " + this.id + " send message " + " | " + message + " |");
    }

    @Override
    public void receive(String message)
    {
        System.out.println("user " + this.id + " receive message " + " | " + message + " |");
    }
}
