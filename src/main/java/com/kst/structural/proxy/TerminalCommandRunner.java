package com.kst.structural.proxy;

public class TerminalCommandRunner implements CommandRunner
{
    @Override
    public void run(String command)
    {
        System.out.println("run command " + command + " in terminal");
    }
}
