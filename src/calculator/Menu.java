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
                Выберите пункт меню:\s
                1)Подсчёт математической операции\s
                2)Выход\s""");
        int number = this.validateInt();
        if (number == 1) {
            System.out.println("Введите первое число - ");
            double a = this.validateDouble();
            System.out.println("Введите второе число - ");
            double b = this.validateDouble();
            System.out.println("Введите математическую операцию");
            char actionType = this.validateChar();
            System.out.println("Результат: " + chooser(a, b, actionType));
            dateInput();

        } else if (number == 2) {
            System.out.println("Всего хорошего!!!");
        }

    }

    private double chooser(double a, double b, char actionType) {
        switch (actionType) {
            case '*':
                Calculator calculator = new Multiplication();
                return calculator.action(a, b);
            case '/':
                while (b == 0) {
                    System.out.println("Деление на 0 невозможно. Введите другое число");
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
                System.out.println("Неправильный символ");
                return 0;
        }


    }

    private int validateInt() {
        while (!scanner.hasNext("[12]")) {
            System.out.println("Такого пункта в меню нет! Введите существующий пункт меню ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private double validateDouble() {
        while (!scanner.hasNextDouble()) {
            System.out.println("Неверное число, введите правильно число!");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    private char validateChar() {
        while (!scanner.hasNext("[*/+-]")) {
            System.out.println("Такой операции не существует. Доступные операции: [+ - * /] !");
            scanner.next();
        }
        return scanner.next().charAt(0);
    }

}


