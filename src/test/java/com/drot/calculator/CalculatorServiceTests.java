package com.drot.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorServiceTests {

    CalculatorService out = new CalculatorService();

    @Test
    void plusTest() {
        int s1 = out.plus(4, 7);
        assertEquals(11, s1);
        int s2 = out.plus(-10, 7);
        assertEquals(-3, s2);

    }

    @Test
    void minusTest() {
        int m1 = out.minus(10, 7);
        assertEquals(3, m1);
        int m2 = out.minus(-10, 7);
        assertEquals(-17, m2);

    }

    @Test
    void multiplyTest() {
        int u1 = out.multiply(2, 7);
        assertEquals(14, u1);
        int u2 = out.multiply(-3, 7);
        assertEquals(-21, u2);

    }

    @Test
    void divideTest() {
        float d = out.divide(24, 2);
        assertEquals(12, d);

        assertThrows(IllegalArgumentException.class, () -> out.divide(2, 0));

    }

}
