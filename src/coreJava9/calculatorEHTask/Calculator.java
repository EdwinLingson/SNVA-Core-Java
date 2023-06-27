package coreJava9.calculatorEHTask;

class Calculator {
    int add(int num1, int num2) {
        return num1 + num2;
    }

    int subtract(int num1, int num2) {
        return num1 - num2;
    }

    int multiply(int num1, int num2) {
        return num1 * num2;
    }

    Double divide(int num1, int num2) {
        Double ret = null;
        try {
            ret = (double) (num1 / num2);
            return ret;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero not allowed");
            return ret;
        }
    }

    Double modulus(int num1, int num2) {
        Double ret = null;
        try {
            ret = (double) (num1 % num2);
            return ret;
        } catch (ArithmeticException e) {
            System.out.println("Modulus by zero not allowed");
            return ret;
        }
    }

    char getSign(int option) {
        switch (option) {
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            case 4:
                return '/';
            case 5:
                return '%';
        }
        return ' ';
    }
}
