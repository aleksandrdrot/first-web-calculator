package com.drot.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class CalculatorApplicationTests {

	CalculatorService out = new CalculatorService();

	@Test
	void plusTest(){
		int s = out.plus(4, 7);
		assertEquals(11 , s);
		assertNotNull(s);
	}

	@Test
	void minusTest(){
		int m = out.minus(10, 7);
		assertEquals(3 , m);
		assertNotNull(m);
	}

	@Test
	void multiplyTest(){
		int u = out.multiply(2, 7);
		assertEquals(14 , u);
		assertNotNull(u);
	}

	@Test
	void divideTest(){
		float d = out.divide(24, 2);
		assertEquals(12 , d);
		assertNotNull(d);
	}

}
