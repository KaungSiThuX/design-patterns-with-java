package com.kst.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ViewGroup extends UIWidget
{
    private final List<UIWidget> children = new ArrayList<>();

    public ViewGroup(int id)
    {
        super(id);
    }

    void add(UIWidget uiWidget)
    {
        this.children.add(uiWidget);
    }

    @Override
    public void paint()
    {
        if (!children.isEmpty())
        {
            System.out.println("start of view group " + this.id + " paint");

            for (UIWidget uiWidget : children)
            {
                uiWidget.paint();
            }

            System.out.println("end of view group " + this.id + " paint");
        }
    }
}
