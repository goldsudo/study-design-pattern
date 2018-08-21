package com.goldsudo.pattern.template.operation;

import com.goldsudo.pattern.template.AbstractCalculator;

public class OperationAdd extends AbstractCalculator {
    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}
