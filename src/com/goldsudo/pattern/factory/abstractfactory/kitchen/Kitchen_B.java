package com.goldsudo.pattern.factory.abstractfactory.kitchen;

import com.goldsudo.pattern.factory.abstractfactory.Tool.Fork;
import com.goldsudo.pattern.factory.abstractfactory.Tool.ITool;
import com.goldsudo.pattern.factory.abstractfactory.food.IFood;
import com.goldsudo.pattern.factory.abstractfactory.food.Meat;

public class Kitchen_B implements IKitchenFactory {

    @Override
    public IFood getFood() {
        return new Meat();
    }

    @Override
    public ITool getTool() {
        return new Fork();
    }
}
