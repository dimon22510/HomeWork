package calculation.resultoperation;

public interface ResultOperationHistory {
    String addToHistory(double result, double a, double b);           //Добавление результата в историю

    void outputHistory(String[] historyArrive);            //Вывод всей истории
}
