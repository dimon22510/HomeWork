package calculator.impl;

import calculator.Calculator;

public class Addition implements Calculator {           //��������
    @Override
    public double action(double a, double b) {
        return a + b;
    }
}
