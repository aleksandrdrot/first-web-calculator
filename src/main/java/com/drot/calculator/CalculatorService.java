package com.drot.calculator;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements Calculator{
    public String hello(){
        return "Добро пожаловать в калькулятор";
    }

    public String plus(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String minus(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String divide(float num1, float num2) {
            return num1 + " / " + num2 + " = " + (num1 / num2);
    }




}
