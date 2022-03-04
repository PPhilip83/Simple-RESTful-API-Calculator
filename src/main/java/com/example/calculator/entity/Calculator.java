package com.example.calculator.entity;

import com.example.calculator.Views;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;

public class Calculator {
    private int Value1;
    private int Value2;
    @JsonView(Views.MyResponseViews.class)
    private int Result;
    @JsonView(Views.MyResponseViews.class)
    private String Function;

    public Calculator(int value1, int value2, String function) {
        this.Value2 = value2;
        this.Function = function;
    }

    public Calculator(int result, String function) {
        this.Result = result;
        this.Function = function;
    }

    public Calculator() {
    }

    public int getValue1() {
        return this.Value1;
    }

    public void setValue1(int value1) {
        this.Value1 = value1;
    }

    public int getValue2() {
        return this.Value2;
    }

    public void setValue2(int value2) {
        this.Value2 = value2;
    }

    public int getResult() {
        return this.Result;
    }

    public void setResult(int result) {
        this.Result = result;
    }

    public String getFunction() {
        return this.Function;
    }

    public void setFunction(String function) {
        this.Function = function;
    }

}
