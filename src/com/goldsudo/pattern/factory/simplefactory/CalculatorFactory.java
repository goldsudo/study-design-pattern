package com.goldsudo.pattern.factory.simplefactory;

import com.goldsudo.pattern.factory.simplefactory.calculator.CalculatorName;
import com.goldsudo.pattern.factory.simplefactory.calculator.ICalculator;
import com.goldsudo.pattern.factory.simplefactory.calculator.impl.AddCalculator;
import com.goldsudo.pattern.factory.simplefactory.calculator.impl.ExcCalculator;
import com.goldsudo.pattern.factory.simplefactory.calculator.impl.MulCalculator;
import com.goldsudo.pattern.factory.simplefactory.calculator.impl.SubCalculator;

/**
 * 运算类工厂
 */
public class CalculatorFactory {
    public static ICalculator getCalculator(String calc) {
        ICalculator calculator = null;
        switch (CalculatorName.getCalcName(calc)) {
            case ADD:
                calculator = new AddCalculator();break;
            case SUB:
                calculator = new SubCalculator();break;
            case MUL:
                calculator = new MulCalculator();break;
            case EXC:
                calculator = new ExcCalculator();break;
            case UNKNOW:
                break;
        }
        return calculator;
    }
}
