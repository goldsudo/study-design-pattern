package com.goldsudo.pattern.chain;

public class HandlerImpl extends AbstractHandler implements Handler {
    public String name;

    HandlerImpl() {
    }

    HandlerImpl(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name + "执行完毕");
        next();
    }
}
