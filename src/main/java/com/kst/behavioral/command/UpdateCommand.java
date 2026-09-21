package com.kst.behavioral.command;

public class UpdateCommand implements Command
{
    @Override
    public void execute()
    {
        System.out.println("execute update command");
    }
}
