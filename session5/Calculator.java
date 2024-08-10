
public class Calculator {

    public static void main(String[] args) {
        CalculatorClass calc = new CalculatorClass();

        System.out.println("Addition of 5 and 10: " + calc.calc(5, 10));
        System.out.println("Addition of 5, 10, and 15: " + calc.calc(5, 10, 15));
        System.out.println("Addition of 5.5 and 10.5: " + calc.calc(5.5, 10.5));

        System.out.println("Subtraction of 10 from 20: " + calc.calcSubtract(20, 10));
        System.out.println("Subtraction of 10 and 5 from 30: " + calc.calcSubtract(30, 10, 5));
        System.out.println("Subtraction of 10.5 from 20.0: " + calc.calcSubtract(20.0, 10.5));

        System.out.println("Multiplication of 5 and 10: " + calc.calcMultiply(5, 10));
        System.out.println("Multiplication of 5, 10, and 2: " + calc.calcMultiply(5, 10, 2));
        System.out.println("Multiplication of 5.5 and 2.5: " + calc.calcMultiply(5.5, 2.5));

        System.out.println("Division of 20 by 4: " + calc.calcDivide(20, 4));
        System.out.println("Division of 20.0 by 4.0: " + calc.calcDivide(20.0, 4.0));

    }

}

class CalculatorClass {

    public int calc(int a, int b) {
        return a + b;
    }

    public int calc(int a, int b, int c) {
        return a + b + c;
    }

    public double calc(double a, double b) {
        return a + b;
    }

    public int calcSubtract(int a, int b) {
        return a - b;
    }

    public int calcSubtract(int a, int b, int c) {
        return a - b - c;
    }

    public double calcSubtract(double a, double b) {
        return a - b;
    }

    public int calcMultiply(int a, int b) {
        return a * b;
    }

    public int calcMultiply(int a, int b, int c) {
        return a * b * c;
    }

    public double calcMultiply(double a, double b) {
        return a * b;
    }

    public double calcDivide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }

    public double calcDivide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }
}
