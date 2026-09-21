package com.kst.behavioral.command;

public class EditCommand implements Command
{
    @Override
    public void execute()
    {
        System.out.println("execute edit command");
    }
}
