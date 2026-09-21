package com.kst.behavioral.strategy;

public class StringComparableStrategy implements ComparableStrategy
{
    @Override
    public void compare()
    {
        System.out.println("compare with string strategy");
    }
}
