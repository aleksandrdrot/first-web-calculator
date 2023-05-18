package com.drot.calculator;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements Calculator{

    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public float divide(int num1, int num2) {
            return (float) num1 / num2;

    }




}
