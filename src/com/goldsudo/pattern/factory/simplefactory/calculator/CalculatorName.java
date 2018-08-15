package com.goldsudo.pattern.factory.simplefactory.calculator;

/**
 * 运算类名称枚举
 */
public enum CalculatorName {
    ADD, SUB, MUL, EXC, UNKNOW;
    public static CalculatorName getCalcName(String calc) {
        try {
            return valueOf(calc);
        } catch (Exception ex) {
            return UNKNOW;
        }
    }
}
