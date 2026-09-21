package com.kst.creational.abstract_factory;

public class WindowButton implements Button
{
    @Override
    public void click()
    {
        System.out.println("window button click");
    }
}
