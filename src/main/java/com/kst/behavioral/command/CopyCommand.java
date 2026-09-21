package com.kst.behavioral.command;

public class CopyCommand implements Command
{
    @Override
    public void execute()
    {
        System.out.println("execute copy command");
    }
}
