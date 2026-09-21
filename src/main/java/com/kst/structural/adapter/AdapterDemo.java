package com.kst.structural.adapter;

public class AdapterDemo
{
    static void main()
    {
        ApiAdapter apiAdapter = new ObjectApiAdapter();
        apiAdapter.call();

        apiAdapter = new ClassApiAdapter();
        apiAdapter.call();

    }
}
