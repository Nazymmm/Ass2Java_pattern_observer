package com.company;

public class Follower2 implements IObserver {
    @Override
    public void update(Message m) {

        System.out.println("Follower2 :: " + m.getMessageContent());
    }
}
