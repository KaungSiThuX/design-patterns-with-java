package com.kst.structural.flyweight;

public class FlyweightDemo
{
    static void main()
    {
        Code code = new Code("int num = 10;");

        PlatformFactory platformFactory = new PlatformFactory();

        Platform platform = platformFactory.getPlatform(PlatformType.JAVA);
        platform.execute(code);

        platform = platformFactory.getPlatform(PlatformType.NODEJS);
        platform.equals(code);

        platform = platformFactory.getPlatform(PlatformType.JAVA);
        platform.execute(code);
    }
}
