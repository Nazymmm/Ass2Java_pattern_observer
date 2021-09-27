package com.company;

public class Main {

    public static void main(String[] args)
    {

        Follower1 f1 = new Follower1();
        Follower2 f2 = new Follower2();


        IGAccount p = new IGAccount();

        p.addf(f1);
        p.addf(f2);

        p.notifyf(new Message("First Message"));   //s1 and s2 will receive the update

        p.removef(f1);
        p.addf(f2);

        p.notifyf(new Message("Second Message")); //s2 and s3 will receive the update
    }
}
