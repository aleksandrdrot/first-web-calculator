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
        return "Добро пожаловать в калькулятор";
    }

    @RequestMapping(value = "plus")
    public String plus(@RequestParam(value = "num1", required = false) Integer num1,
                       @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null){
            return "Данные внесены не корректно!";
        }
        return num1 + " + " + num2 + " = " + calculator.plus(num1, num2);
    }

    @RequestMapping(value = "minus")
    public String minus(@RequestParam(value = "num1", required = false) Integer num1,
                        @RequestParam(value = "num2", required = false) Integer num2){
        if (num1 == null || num2 == null){
            return "Данные внесены не корректно!";
        }
        return num1 + " - " + num2 + " = " + calculator.minus(num1, num2);
    }

    @RequestMapping(value = "multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer num1,
                           @RequestParam(value = "num2", required = false) Integer num2){
        if (num1 == null || num2 == null){
            return "Данные внесены не корректно!";
        }
        return num1 + " * " + num2 + " = " + calculator.multiply(num1, num2);
    }

    @RequestMapping(value = "divide")
    public String divide(@RequestParam(value = "num1", required = false) Integer num1,
                         @RequestParam(value = "num2", required = false) Integer num2){
        if (num1 == null || num2 == null){
            return "Данные внесены не корректно!";
        }
        if (num2 != 0) {
            return num1 + " / " + num2 + " = " + calculator.divide(num1, num2);
        } else {
            return "Деление на <0> недопустимо";
        }
    }

}
