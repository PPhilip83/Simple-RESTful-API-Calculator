package com.example.calculator.service.request;

import com.example.calculator.entity.Calculator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CalculatorRequest {

    @JsonProperty("Calculator") 
    private Calculator Calculator;
    
    public CalculatorRequest(Calculator calculator) {
        this.Calculator = calculator;
    }

    public CalculatorRequest() {
    }

    public Calculator getCalculator() {
        return this.Calculator;
    }

    public void setCalculator(Calculator calculator) {
        this.Calculator = calculator;
    }

}
