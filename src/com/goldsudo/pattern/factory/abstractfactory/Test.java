package com.goldsudo.pattern.factory.abstractfactory;

import com.goldsudo.pattern.factory.abstractfactory.kitchen.IKitchenFactory;
import com.goldsudo.pattern.factory.abstractfactory.kitchen.Kitchen_A;
import com.goldsudo.pattern.factory.abstractfactory.kitchen.Kitchen_B;

public class Test {
    public static void main(String[] args) {
        //厨房A提供的食物与餐具
        System.out.println("KitchenA: ");
        IKitchenFactory kitchenA = new Kitchen_A();
        System.out.println("KitchenA's food:" + kitchenA.getFood().getFoodName());
        System.out.println("KitchenA's tool:" + kitchenA.getTool().getToolName());
        //厨房B提供的食物与餐具
        System.out.println("KitchenB: ");
        IKitchenFactory kitchenB = new Kitchen_B();
        System.out.println("KitchenB's food:" + kitchenB.getFood().getFoodName());
        System.out.println("KitchenB's tool:" + kitchenB.getTool().getToolName());
    }
}
