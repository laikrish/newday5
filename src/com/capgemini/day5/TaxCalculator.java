package com.capgemini.day5;

public class TaxCalculator {

	
		double taxAmount;

		public static double calculateTax(int empSalary, String empName, boolean isIndian) throws Exception{
			
			
			double taxAmount = 0.0;
		
if(isIndian==true && empName!="" && empName!="null") {
				
			if(empSalary>=100000)
			taxAmount=(empSalary*8)/100;
			
			if(empSalary>50000 && empSalary<100000)
				taxAmount=(empSalary*6)/100;
			
			if(empSalary>30000 && empSalary<50000)
				taxAmount=(empSalary*5)/100;
			
			if(empSalary>10000 && empSalary<30000)
				taxAmount=(empSalary*4)/100;
			else
				throw new Exception("Tax not eligible");
			return taxAmount;
} else
	throw new Exception("Country Not Valid");
	
	}
		
}

		
