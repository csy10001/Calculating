package org.example.LV3;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator {
    private final double num1;
    private final double num2;
    private final Operator operator;

    private static final List<Double> results = new ArrayList<>();

    public void add(double result) {
        results.add(result);
    }
    public List<Double> getResults(){
        return new ArrayList<>(results);
    }

    public void printHistory() {
        System.out.println("계산 기록:");
        System.out.println(results);
    }
    public void remove(double result) {
        if (!results.isEmpty()) {
            results.remove(0);
        }
        else {
            System.out.println("삭제 가능한 값이 없습니다.");
        }
    }

    public ArithmeticCalculator(double num1, double num2, Operator operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    public double calculate() {
        return OperatorProcessor.process(num1, num2, operator);
    }
}


