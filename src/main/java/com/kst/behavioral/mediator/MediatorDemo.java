package com.kst.behavioral.mediator;

public class MediatorDemo
{
    static void main()
    {
        User user1 = new User(1);
        User user2 = new User(2);
        User user3 = new User(3);
        User user4 = new User(4);

        ChatRoom chatRoom = new ChatRoom();
        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);
        chatRoom.addUser(user4);

        chatRoom.send(user1, "hello");
    }
}
