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
                Select a menu item:\s
                1)Calculating a mathematical operation\s
                2)Exit\s""");
        int number = this.validateInt();
        if (number == 1) {
            System.out.println("Enter the first number - ");
            double a = this.validateDouble();
            System.out.println("Enter the second number - ");
            double b = this.validateDouble();
            System.out.println("Enter a mathematical operation");
            char actionType = this.validateChar();
            System.out.println("Result: " + chooser(a, b, actionType));
            dateInput();
        } else if (number == 2) {
            System.out.println("Good luck!!!");
        }
    }

    private double chooser(double a, double b, char actionType) {
        switch (actionType) {
            case '*':
                Calculator calculator = new Multiplication();
                return calculator.action(a, b);
            case '/':
                while (b == 0) {
                    System.out.println("Division by 0 is not possible. Please enter another number");
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
                System.out.println("Wrong character");
                return 0;
        }
    }

    private int validateInt() {
        while (!scanner.hasNext("[12]")) {
            System.out.println("There is no such item on the menu! Enter an existing menu item ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private double validateDouble() {
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid number, please enter the correct number!");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    private char validateChar() {
        while (!scanner.hasNext("[*/+-]")) {
            System.out.println("There is no such operation. Available Operations: [+ - * /] !");
            scanner.next();
        }
        return scanner.next().charAt(0);
    }
}


