package com.goldsudo.pattern.observer.observers;

import com.goldsudo.pattern.observer.Observer;

public class Observer1 implements Observer {
    @Override
    public void update(String msg) {
        System.out.println(Observer1.class.getName() + " : " + msg);
    }
}
