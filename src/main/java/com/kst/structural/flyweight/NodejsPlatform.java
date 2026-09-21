package com.kst.structural.flyweight;

public class NodejsPlatform implements Platform
{
    public NodejsPlatform()
    {
        System.out.println("nodejs platform create");
    }

    @Override
    public void execute(Code code)
    {
        System.out.println("nodejs platform execute " + code.codeStr);
    }
}
