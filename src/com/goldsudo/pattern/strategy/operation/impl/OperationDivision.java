package com.goldsudo.pattern.strategy.operation.impl;

import com.goldsudo.pattern.strategy.operation.IOperation;

public class OperationDivision implements IOperation {
    @Override
    public int doOperation(int num1, int num2) {
        if (num2 == 0) {
            throw new RuntimeException("除数不能为零");
        }
        return num1 / num2;
    }
}
