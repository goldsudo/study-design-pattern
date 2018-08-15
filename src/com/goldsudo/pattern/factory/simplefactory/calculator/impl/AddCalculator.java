package com.goldsudo.pattern.factory.simplefactory.calculator.impl;

import com.goldsudo.pattern.factory.simplefactory.calculator.ICalculator;

/**
 * 加法运算类
 */
public class AddCalculator  implements ICalculator {
    @Override
    public double getResult(double num1, double num2) {
        return num1+num2;
    }
}
