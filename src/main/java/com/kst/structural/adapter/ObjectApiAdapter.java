package com.kst.structural.adapter;

public class ObjectApiAdapter implements ApiAdapter
{
    private final OldApi oldApi = new OldApi();

    @Override
    public void call()
    {
        this.oldApi.call();
    }
}
