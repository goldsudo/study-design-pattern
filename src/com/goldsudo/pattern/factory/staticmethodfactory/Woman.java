package com.goldsudo.pattern.factory.staticmethodfactory;

public class Woman implements Humen{

    @Override
    public void eat() {
        System.out.println("Woman eat.");
    }

    @Override
    public void run() {
        System.out.println("Woman run.");
    }

    @Override
    public void sleep() {
        System.out.println("Woman sleep.");
    }
}
