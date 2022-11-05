package calculator;

import calculator.impl.Addition;
import calculator.impl.Division;
import calculator.impl.Multiplication;
import calculator.impl.Subtraction;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner;


    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    protected void dateInput() {
        System.out.println("""
                �������� ����� ����:\s
                1)������� �������������� ��������\s
                2)�����\s""");
        int number = this.validateInt();
        if (number == 1) {
            System.out.println("������� ������ ����� - ");
            double a = this.validateDouble();
            System.out.println("������� ������ ����� - ");
            double b = this.validateDouble();
            System.out.println("������� �������������� ��������");
            char actionType = this.validateChar();
            System.out.println("���������: " + chooser(a, b, actionType));
            dateInput();

        } else if (number == 2) {
            System.out.println("����� ��������!!!");
        }

    }

    private double chooser(double a, double b, char actionType) {
        switch (actionType) {
            case '*':
                Calculator calculator = new Multiplication();
                return calculator.action(a, b);
            case '/':
                while (b == 0) {
                    System.out.println("������� �� 0 ����������. ������� ������ �����");
                    b = validateDouble();
                }
                calculator = new Division();
                return calculator.action(a, b);
            case '+':
                calculator = new Addition();
                return calculator.action(a, b);
            case '-':
                calculator = new Subtraction();
                return calculator.action(a, b);
            default:
                System.out.println("������������ ������");
                return 0;
        }


    }

    private int validateInt() {
        while (!scanner.hasNext("[12]")) {
            System.out.println("������ ������ � ���� ���! ������� ������������ ����� ���� ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private double validateDouble() {
        while (!scanner.hasNextDouble()) {
            System.out.println("�������� �����, ������� ��������� �����!");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    private char validateChar() {
        while (!scanner.hasNext("[*/+-]")) {
            System.out.println("����� �������� �� ����������. ��������� ��������: [+ - * /] !");
            scanner.next();
        }
        return scanner.next().charAt(0);
    }

}


