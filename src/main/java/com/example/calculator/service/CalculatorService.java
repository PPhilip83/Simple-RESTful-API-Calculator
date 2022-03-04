package com.example.calculator.service;

import com.example.calculator.entity.Calculator;
import com.example.calculator.service.request.CalculatorRequest;
import com.example.calculator.service.response.CalculatorResponse;

import org.slf4j.LoggerFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;

@Service
public class CalculatorService {

    private final Logger log = (Logger) LoggerFactory.getLogger(CalculatorService.class);
    
    public CalculatorResponse calculate(CalculatorRequest calc) {
        CalculatorResponse response = new CalculatorResponse();
        int calcResult = 0;

        //switch case handles calculation logic
        switch(calc.getCalculator().getFunction().toLowerCase()) {
            case "add":
                calcResult = calc.getCalculator().getValue1()+calc.getCalculator().getValue2();
                break;
            case "subtract":
                calcResult = calc.getCalculator().getValue1()-calc.getCalculator().getValue2();
                break;
            case "multiply":
                calcResult = calc.getCalculator().getValue1()*calc.getCalculator().getValue2();
                break;
            case "divide":
                calcResult = calc.getCalculator().getValue1()/calc.getCalculator().getValue2();
                break;
            default:
                log.info("Unknown function type");
        }
        //String manipulation to meet client requirement
        String string =  calc.getCalculator().getFunction().toLowerCase();
        string = string.substring(0,1).toUpperCase() + string.substring(1);
        Calculator responseCalc = new Calculator(calcResult, (string + ".Response"));
        response.setCalculator(responseCalc);

        return response;

    }
}
