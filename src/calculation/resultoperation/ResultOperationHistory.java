package calculation.resultoperation;

public interface ResultOperationHistory {
    void addToHistory(double result);           //Добавление результата в историю

    void outputHistory();            //Вывод всей истории
}
