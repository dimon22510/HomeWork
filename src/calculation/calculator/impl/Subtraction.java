package calculation.calculator.impl;

import calculation.calculator.Calculator;

public class Subtraction implements Calculator {
    @Override
    public double action(double a, double b) {
        return a - b;
    }
}
