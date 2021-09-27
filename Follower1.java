package com.company;

public class Follower1 implements IObserver {
    @Override
    public void update(Message m) {
        System.out.println("Follower1 :: " + m.getMessageContent());
    }
}