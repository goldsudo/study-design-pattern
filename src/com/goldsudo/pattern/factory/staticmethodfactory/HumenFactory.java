package com.goldsudo.pattern.factory.staticmethodfactory;

public class HumenFactory {
    public static Man createMan() {
        return new Man();
    }

    public static Woman createWoman() {
        return new Woman();
    }

    public static void main(String[] args) {
        Humen humen = HumenFactory.createMan();
        //Humen humen = HumenFactory.createMan();
        humen.eat();
        humen.run();
        humen.sleep();
    }
}
