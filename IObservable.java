package com.company;

public interface IObservable {

    public void addf(IObserver o);

    public void removef(IObserver o);

    public void notifyf(Message m);



}
