package com.kst.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Tracker
{
    Originator originator;

    public Tracker(Originator originator)
    {
        this.originator = originator;
    }

    List<Mememto> histroy = new ArrayList<>();

    void addHistory(Mememto mememto)
    {
        this.histroy.add(mememto);
    }

    void undo()
    {
        Mememto mememto = this.histroy.get(histroy.size() - 1);

        this.histroy.remove(histroy.size() - 1);

        originator.restore(mememto);
    }
}
