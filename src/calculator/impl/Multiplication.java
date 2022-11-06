package calculator.impl;

import calculator.Calculator;

public class Multiplication implements Calculator {           //Умножение
    @Override
    public double action(double a, double b) {
        return a * b;
    }
}
