package com.goldsudo.pattern.observer;

import com.goldsudo.pattern.observer.observers.Observer1;
import com.goldsudo.pattern.observer.observers.Observer2;
import com.goldsudo.pattern.observer.observers.Observer3;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        notifyAllObservers(msg);
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers(String msg) {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }

    public static void main(String[] args) {
        Observer observer1 = new Observer1();
        Observer observer2 = new Observer2();
        Observer observer3 = new Observer3();
        Subject subject = new Subject();
        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);
        subject.setMsg("msg change");
    }
}
