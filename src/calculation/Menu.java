package calculation;

import calculation.calculator.Calculator;
import calculation.calculator.impl.Addition;
import calculation.calculator.impl.Division;
import calculation.calculator.impl.Multiplication;
import calculation.calculator.impl.Subtraction;
import calculation.resultoperation.ResultOperationHistory;
import calculation.resultoperation.impl.ResultOperationHistoryImpl;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner;
    private final String REGEX_FOR_INTEGER = "[123]";
    private final String REGEX_FOR_CHAR = "[*/+-]";
    private int arraySize;
    private final ResultOperationHistory resultOperationHistory;


    public Menu(int arraySize) {
        this.scanner = new Scanner(System.in);
        this.arraySize = arraySize;
        this.resultOperationHistory = new ResultOperationHistoryImpl(new double[arraySize]);
    }

    protected void dataInput() {
        System.out.println("""
                Select a menu item:\s
                1)Calculating a mathematical operation\s
                2)History of calculator results\s
                3)Exit\s""");
        int number = this.validateInt();
        double result;
        if (number == 1) {
            System.out.println("Enter the first number - ");
            double a = this.validateDouble();
            System.out.println("Enter a mathematical operation");
            char actionType = this.validateChar();
            System.out.println("Enter the second number - ");
            double b = this.validateDouble();
            result = chooser(a, b, actionType);
            System.out.println("Result: " + result);
            dataInput();
        } else if (number == 2) {
            System.out.println("The result of the last mathematical operations: ");
            resultOperationHistory.outputHistory();
            dataInput();
        } else if (number == 3) {
            System.out.println("Good luck!!!");
        }
    }

    private double chooser(double a, double b, char actionType) {
        switch (actionType) {
            case '*':
                return doCalculation(a, b, new Multiplication());
            case '/':
                while (b == 0) {
                    System.out.println("Division by 0 is not possible. Please enter another number");
                    b = validateDouble();
                }
                return doCalculation(a, b, new Division());
            case '+':
                return doCalculation(a, b, new Addition());
            case '-':
                return doCalculation(a, b, new Subtraction());
            default:
                System.out.println("Wrong character");
                return 0;
        }
    }

    private double doCalculation(double a, double b, Calculator calculator) {
        double result;
        result = calculator.action(a, b);
        resultOperationHistory.addToHistory(result);
        return result;
    }

    private int validateInt() {
        while (!scanner.hasNext(REGEX_FOR_INTEGER)) {
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
        while (!scanner.hasNext(REGEX_FOR_CHAR)) {
            System.out.println("There is no such operation. Available operations: [+ - * /] !");
            scanner.next();
        }
        return scanner.next().charAt(0);
    }
}


