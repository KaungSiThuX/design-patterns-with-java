package com.kst.structural.proxy;

public class ProxyDemo
{
    static void main()
    {
        CommandRunner commandRunner = new AccessProxy("admin", "pass");

        commandRunner.run("ls -lah");
    }
}
