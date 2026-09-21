package com.kst.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher
{
    private final List<Subscriber> subscriberList = new ArrayList<>();

    void add(Subscriber subscriber)
    {
        this.subscriberList.add(subscriber);
    }

    void remove(Subscriber subscriber)
    {
        this.subscriberList.remove(subscriber);
    }

    void publish(String message)
    {
        if (!subscriberList.isEmpty())
        {
            for (Subscriber subscriber : subscriberList)
            {
                subscriber.handle(message);
            }
        }
    }
}
