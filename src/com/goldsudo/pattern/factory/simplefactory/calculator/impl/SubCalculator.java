package com.goldsudo.pattern.factory.simplefactory.calculator.impl;

import com.goldsudo.pattern.factory.simplefactory.calculator.ICalculator;

/**
 * 减法运算类
 */
public class SubCalculator implements ICalculator {
    @Override
    public double getResult(double num1, double num2) {
        return num1-num2;
    }
}
