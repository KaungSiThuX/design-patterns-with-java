package com.kst.creational.prototype;

public class Circle extends Shape
{
    protected int radius;

    public Circle()
    {
    }

    public Circle(Circle circle)
    {
        super(circle);

        if (circle != null)
        {
            this.radius = circle.radius;
        }
    }

    @Override
    public Shape clone()
    {
        return new Circle(this);
    }
}
