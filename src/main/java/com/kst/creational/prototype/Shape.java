package com.kst.creational.prototype;

public abstract class Shape
{
    protected int x;
    protected int y;
    protected String colour;

    protected Shape()
    {
    }

    protected Shape(Shape shape)
    {
        if (shape != null)
        {
            this.x = shape.x;
            this.y = shape.y;
            this.colour = shape.colour;
        }
    }

    public abstract Shape clone();
}
