package com.kst.creational.prototype;

public class PrototypeDemo
{
    static void main()
    {
        Circle circle1 = new Circle();
        circle1.x = 1;
        circle1.y = 2;
        circle1.colour = "blue";
        circle1.radius = 10;

        Circle circle2 = (Circle) circle1.clone();
        Circle circle3 = (Circle) circle1.clone();

        System.out.println("circle 1 == circle 2 " + (circle2 == circle3));
        System.out.println("circle 2 == circle 3 " + (circle2 == circle3));
        System.out.println("circle 1 == circle 3 " + (circle1 == circle3));
    }
}
