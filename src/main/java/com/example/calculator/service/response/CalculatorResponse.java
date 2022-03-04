package com.example.calculator.service.response;

import com.example.calculator.Views;
import com.example.calculator.entity.Calculator;
import com.fasterxml.jackson.annotation.JsonView;

public class CalculatorResponse {
    @JsonView(Views.MyResponseViews.class)
    private Calculator Calculator;
    
    public CalculatorResponse(Calculator calculator) {
        this.Calculator = calculator;
    }

    public CalculatorResponse() {
    }

    public Calculator getCalculator() {
        return this.Calculator;
    }

    public void setCalculator(Calculator calculator) {
        this.Calculator = calculator;
    }

}
