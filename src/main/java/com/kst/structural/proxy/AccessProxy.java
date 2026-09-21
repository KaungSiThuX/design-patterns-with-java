package com.kst.structural.proxy;

public class AccessProxy implements CommandRunner
{
    boolean isAdmin = false;
    CommandRunner commandRunner = new TerminalCommandRunner();

    public AccessProxy(String name, String password)
    {
        if (name.equals("admin") && password.equals("pass"))
        {
            this.isAdmin = true;
        }
    }

    @Override
    public void run(String command)
    {
        if (isAdmin)
        {
            this.commandRunner.run(command);
        }
        else
        {
            throw new RuntimeException("only admin can run command runner");
        }
    }
}
