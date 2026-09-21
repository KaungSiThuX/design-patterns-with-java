package com.kst.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom
{
    List<User> userList = new ArrayList<>();

    void addUser(User user)
    {
        this.userList.add(user);
    }

    void remove(User user)
    {
        this.userList.remove(user);
    }

    void send(User sender, String message)
    {
        if (!this.userList.isEmpty())
        {
            sender.send(message);
            
            for (User user : userList)
            {
                if (user.id != sender.id)
                {
                    user.receive(message);
                }
            }
        }
    }

}
