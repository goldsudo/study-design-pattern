package com.goldsudo.pattern.template.operation;

import com.goldsudo.pattern.template.AbstractCalculator;

public class OperationDivision extends AbstractCalculator {
    @Override
    public int calculate(int num1, int num2) {
        if (num2 == 0) {
            throw new RuntimeException("除数不能为零");
        }
        return num1 / num2;
    }
}
