package com.kst.structural.composite;

public abstract class UIWidget
{
    int id;

    public UIWidget(int id)
    {
        this.id = id;
    }

    public abstract void paint();
}
