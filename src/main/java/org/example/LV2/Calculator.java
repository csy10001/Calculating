package org.example.LV2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Calculator {
    private List<Double> arrresult = new ArrayList<>();

    public void add(double result) {
        arrresult.add(result);
    }

    public List<Double> getArrresult(){
        return this.arrresult;
    }
    public void setArrresult(List<Double> arrresult) {
        this.arrresult = arrresult;
    }

    public void remove(double result) {
        arrresult.remove(result);
    }

}
