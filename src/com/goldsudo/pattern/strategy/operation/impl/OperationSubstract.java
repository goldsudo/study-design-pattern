package com.goldsudo.pattern.strategy.operation.impl;

import com.goldsudo.pattern.strategy.operation.IOperation;

public class OperationSubstract implements IOperation {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
