package com.goldsudo.pattern.strategy;

import com.goldsudo.pattern.strategy.operation.IOperation;
import com.goldsudo.pattern.strategy.operation.impl.OperationAdd;
import com.goldsudo.pattern.strategy.operation.impl.OperationDivision;
import com.goldsudo.pattern.strategy.operation.impl.OperationMultiply;
import com.goldsudo.pattern.strategy.operation.impl.OperationSubstract;

public class Calculator {
    IOperation operation;

    public Calculator() {

    }

    public Calculator(IOperation operation) {
        this.operation = operation;
    }

    public void setOperation(IOperation operation) {
        this.operation = operation;
    }

    public int doCalc(int num1, int num2) {
        return operation.doOperation(num1, num2);
    }

    public static void main(String[] args) {
        int num1 = 5, num2 = 3;
        //加法策略
        Calculator calculator = new Calculator(new OperationAdd());
        System.out.println("5 + 3 = " + calculator.doCalc(num1, num2));
        //切换减法策略
        calculator.setOperation(new OperationSubstract());
        System.out.println("5 - 3 = " + calculator.doCalc(num1, num2));
        //切换乘法策略
        calculator.setOperation(new OperationMultiply());
        System.out.println("5 * 3 = " + calculator.doCalc(num1, num2));
        //切换除法策略
        calculator.setOperation(new OperationDivision());
        System.out.println("5 / 3 = " + calculator.doCalc(num1, num2));
    }
}
