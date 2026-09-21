package com.kst.behavioral.strategy;

public class StrategyDemo
{
    static void main()
    {
        NumberComparableStrategy numberComparableStrategy = new NumberComparableStrategy();
        StringComparableStrategy stringComparableStrategy = new StringComparableStrategy();

        SortingAlgorithm sortingAlgorithm = new SortingAlgorithm();

        sortingAlgorithm.setStrategy(numberComparableStrategy);
        sortingAlgorithm.sort();

        sortingAlgorithm.setStrategy(stringComparableStrategy);
        sortingAlgorithm.sort();
    }
}
