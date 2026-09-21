package com.kst.behavioral.command;

public class CommandDemo
{
    static void main()
    {
        UpdateCommand updateCommand = new UpdateCommand();
        EditCommand editCommand = new EditCommand();
        CopyCommand copyCommand = new CopyCommand();
        Executor executor = new Executor();

        executor.addCommand(updateCommand);
        executor.addCommand(editCommand);
        executor.addCommand(copyCommand);

        executor.execute();
    }
}
