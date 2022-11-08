package calculation;

import calculation.calculator.Calculator;
import calculation.calculator.impl.Addition;
import calculation.calculator.impl.Division;
import calculation.calculator.impl.Multiplication;
import calculation.calculator.impl.Subtraction;
import calculation.resultoperation.ResultOperationHistory;
import calculation.resultoperation.impl.AdditionResult;
import calculation.resultoperation.impl.DivisionResult;
import calculation.resultoperation.impl.MultiplicationResult;
import calculation.resultoperation.impl.SubtractionResult;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner;
    private final String REGEX_FOR_INTEGER = "[123]";
    private String[] historyArray;
    private int counter;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.historyArray = new String[3];
        this.counter = 0;
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
            ResultOperationHistory resultOperationHistory = new AdditionResult();          // Не отличаются в addition от всех остальных, поэтому имплиминтировали только в одном
            System.out.println("The result of the last mathematical operations: ");
            resultOperationHistory.outputHistory(historyArray);
            dataInput();
        } else if (number == 3) {
            System.out.println("Good luck!!!");
        }
    }

    private double chooser(double a, double b, char actionType) {
        Calculator calculator;
        ResultOperationHistory resultOperationHistory;
        switch (actionType) {
            case '*':
                resultOperationHistory = new MultiplicationResult();
                calculator = new Multiplication();
                return doCalculation(a, b, calculator, resultOperationHistory);
            case '/':
                while (b == 0) {
                    System.out.println("Division by 0 is not possible. Please enter another number");
                    b = validateDouble();
                }
                resultOperationHistory = new DivisionResult();
                calculator = new Division();
                return doCalculation(a, b, calculator, resultOperationHistory);
            case '+':
                resultOperationHistory = new AdditionResult();
                calculator = new Addition();
                return doCalculation(a, b, calculator, resultOperationHistory);
            case '-':
                resultOperationHistory = new SubtractionResult();
                calculator = new Subtraction();
                return doCalculation(a, b, calculator, resultOperationHistory);
            default:
                System.out.println("Wrong character");
                return 0;
        }
    }

    private double doCalculation(double a, double b, Calculator calculator, ResultOperationHistory resultOperationHistory) {
        double result = calculator.action(a, b);
        if (counter == historyArray.length) {
            counter = 0;
        }
        this.historyArray[counter] = resultOperationHistory.addToHistory(result, a, b);
        counter++;
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
        while (!scanner.hasNext("[*/+-]")) {
            System.out.println("There is no such operation. Available Operations: [+ - * /] !");
            scanner.next();
        }
        return scanner.next().charAt(0);
    }
}


