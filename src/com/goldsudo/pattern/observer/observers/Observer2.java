package com.goldsudo.pattern.observer.observers;

import com.goldsudo.pattern.observer.Observer;

public class Observer2 implements Observer {
    @Override
    public void update(String msg) {
        System.out.println(Observer2.class.getName() + " : " + msg);
    }
}
