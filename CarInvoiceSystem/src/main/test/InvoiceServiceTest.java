package main.test;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.InvoiceGenerator;

public class InvoiceServiceTest {
	
	InvoiceGenerator invoiceGenerator;
	
	@BeforeEach
	public void initialize() {
		invoiceGenerator=new InvoiceGenerator();
	}
	
	
	
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
		 double distance=20.0;
		 double time=45.0;
		double totalFare=invoiceGenerator.calculateTotalFare(distance,time);
		 Assert.assertEquals(900.0, totalFare,0.0);
	}
	
	@Test
	public void givenDistanceAndTime_ShouldReturnMinFare() {
		double distance=0.1;
		 double time=1;
		double totalFare=invoiceGenerator.calculateTotalFare(distance,time);
		 Assert.assertEquals(5.0, totalFare,0.0);
	}
}
