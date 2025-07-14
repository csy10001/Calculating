package org.example.LV3;

public class OperatorProcessor {
    public static double process(double num1, double num2, Operator operator) {
        switch (operator) {
            case PLUS:
                return num1 + num2;
            case MINUS:
                return num1 - num2;
            case MULTIPLY:
                return num1 * num2;
            case DIVIDE:
                if (num2 == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                return num1 / num2;
            default:
                throw new UnsupportedOperationException("지원하지 않는 연산자입니다.");
        }
    }
}

