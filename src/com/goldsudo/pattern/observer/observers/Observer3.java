package com.goldsudo.pattern.observer.observers;

import com.goldsudo.pattern.observer.Observer;

public class Observer3 implements Observer {
    @Override
    public void update(String msg) {
        System.out.println(Observer3.class.getName() + " : " + msg);
    }
}
