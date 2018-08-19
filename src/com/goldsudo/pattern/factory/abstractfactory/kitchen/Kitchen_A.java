package com.goldsudo.pattern.factory.abstractfactory.kitchen;

import com.goldsudo.pattern.factory.abstractfactory.Tool.ITool;
import com.goldsudo.pattern.factory.abstractfactory.Tool.Knife;
import com.goldsudo.pattern.factory.abstractfactory.food.Apple;
import com.goldsudo.pattern.factory.abstractfactory.food.IFood;

public class Kitchen_A implements IKitchenFactory {
    @Override
    public IFood getFood() {
        return new Apple();
    }

    @Override
    public ITool getTool() {
        return new Knife();
    }
}
