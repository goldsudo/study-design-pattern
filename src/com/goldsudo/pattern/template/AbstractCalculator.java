package com.goldsudo.pattern.template;

import com.goldsudo.pattern.template.operation.OperationAdd;
import com.goldsudo.pattern.template.operation.OperationDivision;
import com.goldsudo.pattern.template.operation.OperationMultiply;
import com.goldsudo.pattern.template.operation.OperationSubstract;

public abstract class AbstractCalculator {

    /**
     * 主方法，实现对本类其它方法的调用
     */
    public final int calculate(String exp, String opt) {
        int array[] = split(exp, opt);
        return calculate(array[0], array[1]);
    }

    /**
     * 被子类重写的方法
     */
    abstract public int calculate(int num1, int num2);

    public int[] split(String exp, String opt) {
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }

    public static void printResult(AbstractCalculator cal, String exp, String split) {
        System.out.println(exp + " = " + cal.calculate(exp, split));
    }

    public static void main(String[] args) {
        String exp = "5+3";
        AbstractCalculator cal = new OperationAdd();
        printResult(cal, exp, "\\+");
        exp = "5-3";
        cal = new OperationSubstract();
        printResult(cal, exp, "\\-");
        exp = "5*3";
        cal = new OperationMultiply();
        printResult(cal, exp, "\\*");
        exp = "5/3";
        cal = new OperationDivision();
        printResult(cal, exp, "\\/");
    }
}
