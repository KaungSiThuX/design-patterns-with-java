package com.kst.behavioral.observer;

public class ObserverDemo
{
    static void main()
    {
        Publisher publisher = new Publisher();

        Subscriber subscriber1 = new Subscriber(1);
        publisher.add(subscriber1);

        Subscriber subscriber2 = new Subscriber(2);
        publisher.add(subscriber2);

        Subscriber subscriber3 = new Subscriber(3);
        publisher.add(subscriber3);

        Subscriber subscriber4 = new Subscriber(4);
        publisher.add(subscriber4);
        
        publisher.publish("hello from publisher");
    }
}
