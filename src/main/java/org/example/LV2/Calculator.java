package org.example.LV2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Calculator {
    private List<Double> results = new ArrayList<>();

    public void add(double result) {
        results.add(result);
    }

    public List<Double> getResults(){
        return this.results;
    }
    public void setResults(List<Double> results) {
        this.results = results;
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
}
