package calculation.resultoperation.impl;

import calculation.resultoperation.ResultOperationHistory;

public class SubtractionResult implements ResultOperationHistory {
    @Override
    public String addToHistory(double result, double a, double b) {
        return a + " - " + b + " = " + result;
    }

    @Override
    public void outputHistory(String[] arrive) {
    }
}
