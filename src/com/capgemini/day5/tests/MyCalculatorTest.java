package com.capgemini.day5.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.MyCalculator;

class MyCalculatorTest {

	@Test
	void testPowerWithValidInputs() throws Exception {
assertEquals(243,MyCalculator.power(3,5));
assertEquals(16,MyCalculator.power(2,4));
assertEquals(32,MyCalculator.power(2,5));



	}
	@Test
	void testPowerWithZeroInputs() {
		Exception e;
		e=assertThrows(Exception.class,()-> MyCalculator.power(0, 0));
		assertEquals("n and p should not be zero",e.getMessage());	//or e.toString();
	}
	@Test
	void testPowerWithNegativeInputs() {
		Exception e ;
		
		e=assertThrows(Exception.class,() -> MyCalculator.power(-2, -5));
		assertEquals("n and p should not be negative",e.getMessage());
		assertThrows(Exception.class,() -> MyCalculator.power(-2, 5));
		assertEquals("n and p should not be negative",e.getMessage());
		assertThrows(Exception.class,() -> MyCalculator.power(2, -5));
		assertEquals("n and p should not be negative",e.getMessage());
			
	}
}
