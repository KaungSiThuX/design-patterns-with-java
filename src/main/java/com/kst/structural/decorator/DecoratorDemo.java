package com.kst.structural.decorator;

public class DecoratorDemo
{
    static void main()
    {
        Logger logger = new TimeLogger(new HtmlLogger(new BasicLogger()));
        System.out.println(logger.log("hello"));
    }
}
