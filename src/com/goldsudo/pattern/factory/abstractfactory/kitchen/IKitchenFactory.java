package com.goldsudo.pattern.factory.abstractfactory.kitchen;

import com.goldsudo.pattern.factory.abstractfactory.Tool.ITool;
import com.goldsudo.pattern.factory.abstractfactory.food.IFood;

public interface IKitchenFactory {
    public IFood getFood();
    public ITool getTool();
}
