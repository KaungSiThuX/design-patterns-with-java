package com.kst.structural.composite;

public class CompositeDemo
{
    static void main()
    {
        View view1 = new View(1);
        View view2 = new View(2);
        View view3 = new View(3);

        ViewGroup viewGroup = new ViewGroup(1);
        viewGroup.add(view1);
        viewGroup.add(view2);
        viewGroup.add(view3);

        View view4 = new View(4);
        View view5 = new View(5);
        ViewGroup childViewGroup = new ViewGroup(2);
        childViewGroup.add(view4);
        childViewGroup.add(view5);

        viewGroup.add(childViewGroup);

        viewGroup.paint();
    }
}
