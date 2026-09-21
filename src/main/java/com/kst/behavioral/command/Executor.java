package com.kst.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Executor
{
    List<Command> commandList = new ArrayList<>();

    void addCommand(Command command)
    {
        this.commandList.add(command);
    }

    void execute()
    {
        if (!this.commandList.isEmpty())
        {
            for (Command command : commandList)
            {
                command.execute();
            }
        }
    }
}
