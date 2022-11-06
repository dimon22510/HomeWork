package calculator.impl;

import calculator.Calculator;

public class Addition implements Calculator {           //Сложение
    @Override
    public double action(double a, double b) {
        return a + b;
    }
}
