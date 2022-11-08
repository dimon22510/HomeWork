package calculation.resultoperation.impl;

import calculation.resultoperation.ResultOperationHistory;

public class AdditionResult implements ResultOperationHistory {
    @Override
    public String addToHistory(double result, double a, double b) {
        return a + " + " + b + " = " + result;
    }

    @Override
    public void outputHistory(String[] historyArray) {
        for (int i = 0; i < historyArray.length; i++) {
            System.out.println(historyArray[i]);
        }
    }
}
