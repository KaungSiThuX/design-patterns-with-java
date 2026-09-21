package com.kst.behavioral.strategy;

public class NumberComparableStrategy implements ComparableStrategy
{
    @Override
    public void compare()
    {
        System.out.println("compare with number strategy");
    }
}
