package com.kst.structural.flyweight;

public class JavaPlatform implements Platform
{
    public JavaPlatform()
    {
        System.out.println("java platform create");
    }

    @Override
    public void execute(Code code)
    {
        System.out.println("java platform execute code " + code.codeStr);
    }
}
