package com.goldsudo.pattern.factory.simplefactory;

import com.goldsudo.pattern.factory.simplefactory.calculator.ICalculator;

import java.util.Scanner;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        double num1 = 0.0;
        double num2 = 0.0;
        String opt = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入 num1:");
        num1 = scanner.nextDouble();
        System.out.println("输入 num2:");
        num2 = scanner.nextDouble();
        System.out.println("输入 opt:");
        opt = scanner.next();
        scanner.close();

        ICalculator calculator = CalculatorFactory.getCalculator(opt);
        if (null != calculator) {
            double res = calculator.getResult(num1, num2);
            System.out.println(res);
        } else {
            System.out.println("暂不支持 " + opt + " 运算符！");
        }
    }
}
