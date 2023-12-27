package com.calculator.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppModel {
    private Character operation;
    private Float firstNum;
    private Float secondNum;
    private Float result;

    public AppModel() {}
    public AppModel(Float firstNum, Float secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }
    public AppModel(Float result) {
        this.result = result;
    }
}
