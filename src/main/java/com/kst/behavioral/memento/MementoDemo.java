package com.kst.behavioral.memento;

public class MementoDemo
{
    static void main()
    {
        Originator originator = new Originator();
        Tracker tracker = new Tracker(originator);

        Mememto mememto1 = new Mememto("hello");
    }
}
