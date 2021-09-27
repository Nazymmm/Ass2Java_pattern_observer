package com.company;

import java.util.ArrayList;
import java.util.List;

public class IGAccount implements IObservable {

    private List<IObserver> observers = new ArrayList<>();


    @Override
    public void addf(IObserver o) {
        observers.add(o);
    }

    @Override
    public void removef(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyf(Message m) {
        for (IObserver o : observers) {
            o.update(m);
        }
    }
}