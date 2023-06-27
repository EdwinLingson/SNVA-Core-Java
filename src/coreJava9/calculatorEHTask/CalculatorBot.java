package coreJava9.calculatorEHTask;

import java.util.InputMismatchException;
import java.util.Scanner;

class CalculatorBot {
    static Scanner scanner = new Scanner(System.in);

    static Integer takeIntValue(String prompt) {
        Integer num1 = null;
        try {
            System.out.println(prompt);
            num1 = Integer.valueOf(scanner.next());
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Input is invalid, give valid input");
            return num1;
        }
        return num1;
    }

    static void startCalculator() {
        System.out.println("Hi User, Welcome to EH Calculator");
        Integer num1, num2;
        Integer option = 0;
        Double result = null;
        Calculator calculator = new Calculator();
        do {
            num1 = takeIntValue("Enter Num1");
            if (num1 == null) continue;
            num2 = takeIntValue("Enter Num2");
            if (num2 == null) continue;

            System.out.printf("What operation do you want to operate on %d and %d\n", num1, num2);
            System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Modulus");
            option = takeIntValue("Enter your Selection");
            if (option != null)
                switch (option) {
                    case 1:
                        result = (double) calculator.add(num1, num2);
                        break;
                    case 2:
                        result = (double) calculator.subtract(num1, num2);
                        break;
                    case 3:
                        result = (double) calculator.multiply(num1, num2);
                        break;
                    case 4:
                        result = calculator.divide(num1, num2);
                        break;
                    case 5:
                        result = calculator.modulus(num1, num2);
                        break;
                    default:
                        System.out.println("Invalid operation");
                }
            else {
                System.out.println("Invalid operation");
                option = 0;
                continue;
            }
            if (option < 6 && option != 0)
                System.out.println(result != null ? "The result of operation " + num1 + calculator.getSign(option) + num2 + " = " + result : "Enter Valid Inputs");
            option = takeIntValue("Do you want to Proceed\n1.Yes\n2.No");
            if (option == 2) option = 6;
        } while (option != 6);
    }
}
