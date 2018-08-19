package com.goldsudo.pattern.factory.staticmethodfactory.humen;

import com.goldsudo.pattern.factory.staticmethodfactory.humen.Humen;

public class Man implements Humen {

    @Override
    public void eat() {
        System.out.println("Man eat.");
    }

    @Override
    public void run() {
        System.out.println("Man run.");
    }

    @Override
    public void sleep() {
        System.out.println("Man sleep.");
    }
}
