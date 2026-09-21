package com.kst.behavioral.memento;

public class Originator
{
    String state;

    void changeState(String state)
    {
        this.state = state;
    }

    Mememto saveState()
    {
        return new Mememto(this.state);
    }

    void restore(Mememto mememto)
    {
        this.state = mememto.state;
    }
}
