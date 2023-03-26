package com.drot.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculator")
public class CalculatorController {
    private final CalculatorService calculator;

    public CalculatorController(CalculatorService calculator) {
        this.calculator = calculator;
    }

    @RequestMapping()
    public String hello(){
        return calculator.hello();
    }

    @RequestMapping(value = "plus")
    public String plus(@RequestParam(value = "num1") int num1, @RequestParam(value = "num2") int num2) {
        return calculator.plus(num1, num2);
    }

    @RequestMapping(value = "minus")
    public String minus(@RequestParam(value = "num1") int num1, @RequestParam(value = "num2") int num2){
        return calculator.minus(num1, num2);
    }

    @RequestMapping(value = "multiply")
    public String multiply(@RequestParam(value = "num1") int num1, @RequestParam(value = "num2") int num2){
        return calculator.multiply(num1, num2);
    }

    @RequestMapping(value = "divide")
    public String divide(@RequestParam(value = "num1") float num1, @RequestParam(value = "num2") float num2){
        if (num2 != 0) {
            return calculator.divide(num1, num2);
        } else {
            return "Деление на <0> недопустимо";
        }
    }

}
