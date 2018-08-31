package com.capgemini.day5.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.MyCalculator;
import com.capgemini.day5.TaxCalculator;

class TaxCalculatorTest {
@Test
void testcalculateTaxWithValidInputs() throws Exception
{
	assertEquals(6000.00,TaxCalculator.calculateTax(100000,"krishna",true));
}

	
	@Test
	void testcalulateTaxWithInvalidName() throws Exception {
		Exception e;
		e=assertThrows(Exception.class,()-> TaxCalculator.calculateTax(1000,"",true));
		assertEquals("Employee name invalid",e.getMessage());	
		
		
	}
	@Test
	void testcalculateTaxWithIneligible() throws Exception{
		Exception e;
		e=assertThrows(Exception.class,()-> TaxCalculator.calculateTax(10,"krishna",true));
		assertEquals("Tax not eligible",e.getMessage());	
		
		
	}
	@Test
	void testCalculateTaxWithInvalidCountry() throws Exception {
		Exception e;
		e=assertThrows(Exception.class,()-> TaxCalculator.calculateTax(100000,"krishna",false));
		assertEquals("Country Not Valid",e.getMessage());	
		
		
	}
}

