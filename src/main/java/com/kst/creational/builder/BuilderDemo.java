package com.kst.creational.builder;

public class BuilderDemo
{
    static void main()
    {
        Text text = new Text.Builder().color("red").label("hello").font("bold").build();

        System.out.println(text);
    }
}
