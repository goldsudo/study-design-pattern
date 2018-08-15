package com.goldsudo.pattern.factory.simplefactory.calculator.impl;

import com.goldsudo.pattern.factory.simplefactory.calculator.ICalculator;

/**
 * 除法运算类
 */
public class ExcCalculator implements ICalculator {
    @Override
    public double getResult(double num1, double num2) {
        if(num2!=0){
            return num1/num2;
        }
        else{
            return Double.MAX_VALUE;
        }
    }
}
