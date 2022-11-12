package calculation.resultoperation.impl;

import calculation.resultoperation.ResultOperationHistory;

public class ResultOperationHistoryImpl implements ResultOperationHistory {

    private double[] history;
    private int counter = 0;

    public ResultOperationHistoryImpl(double[] history) {
        this.history = history;
    }

    public ResultOperationHistoryImpl() {
        this.history = new double[5];
    }

    @Override
    public void addToHistory(double result) {
        history[counter] = result;
        counter++;
        if (counter == history.length) {
            counter = 0;
        }
    }

    @Override
    public void outputHistory() {
        for (int i = 0; i < history.length; i++) {
            System.out.println(history[i]);
        }
    }
}
