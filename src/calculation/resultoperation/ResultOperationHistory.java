package calculation.resultoperation;

public interface ResultOperationHistory {
    String addToHistory(double result, double a, double b);           //���������� ���������� � �������

    void outputHistory(String[] historyArrive);            //����� ���� �������
}
