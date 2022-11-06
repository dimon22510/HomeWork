package calculator.impl;

import calculator.Calculator;

public class Division implements Calculator {             //Δελενθε
    @Override
    public double action(double a, double b) {
        return a / b;
    }
}
