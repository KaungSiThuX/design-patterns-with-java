package com.kst.structural.composite;

public class View extends UIWidget
{
    public View(int id)
    {
        super(id);
    }

    @Override
    public void paint()
    {
        System.out.println("view " + this.id + " paint");
    }
}
