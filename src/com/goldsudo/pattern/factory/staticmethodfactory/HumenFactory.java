package com.goldsudo.pattern.factory.staticmethodfactory;

import com.goldsudo.pattern.factory.staticmethodfactory.humen.Humen;
import com.goldsudo.pattern.factory.staticmethodfactory.humen.Man;
import com.goldsudo.pattern.factory.staticmethodfactory.humen.Woman;

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
