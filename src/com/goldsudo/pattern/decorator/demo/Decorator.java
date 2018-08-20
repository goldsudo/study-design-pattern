package com.goldsudo.pattern.decorator.demo;

public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source) {
        super();
        this.source = source;
    }

    @Override
    public void method() {
        source.method();
        System.out.println("do something!");
    }

    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable sourceDecorated = new Decorator(source);
        sourceDecorated.method();
    }
}
