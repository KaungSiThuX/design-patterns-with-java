package com.kst.behavioral.strategy;

public class SortingAlgorithm
{
    ComparableStrategy comparableStrategy;

    void setStrategy(ComparableStrategy comparableStrategy)
    {
        this.comparableStrategy = comparableStrategy;
    }

    void sort()
    {
        System.out.println("run sorting algorithm");
        this.comparableStrategy.compare();
    }
}
