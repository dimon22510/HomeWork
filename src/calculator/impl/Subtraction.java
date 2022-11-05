package calculator.impl;

import calculator.Calculator;

public class Subtraction implements Calculator {         //Вычитание
    @Override
    public double action(double a, double b) {
        return a-b;
    }
}
