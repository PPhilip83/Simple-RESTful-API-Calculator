package com.example.calculator;

import java.util.concurrent.atomic.AtomicLong;

import com.example.calculator.entity.Calculator;
import com.example.calculator.service.CalculatorService;
import com.example.calculator.service.request.CalculatorRequest;
import com.example.calculator.service.response.CalculatorResponse;
import com.fasterxml.jackson.annotation.JsonView;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

	private final Logger log = LoggerFactory.getLogger(CalculatorController.class);

	private final CalculatorService calculatorService;
	private CalculatorRequest calculatorRequest;

	private CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}

	@GetMapping("/calculate")
	@JsonView(Views.MyResponseViews.class)
	public CalculatorResponse calculate(@RequestBody CalculatorRequest calculator) {
		log.info("Calculate function " + calculator.getCalculator().getFunction().toLowerCase() + " called for " + calculator.getCalculator().getValue1() + " and " + calculator.getCalculator().getValue2());
		return calculatorService.calculate(calculator);
	}

}
