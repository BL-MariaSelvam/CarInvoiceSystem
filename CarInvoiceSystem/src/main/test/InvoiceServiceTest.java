package main.test;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.InvoiceGenerator;
import main.java.InvoiceService;
import main.java.Ride;
import main.java.RideType;

public class InvoiceServiceTest {
	
	InvoiceGenerator invoiceGenerator;
	Ride ride;
	
	@BeforeEach
	public void initialize() {
		invoiceGenerator=new InvoiceGenerator();
	}
	
	
	
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
		 double distance=20.0;
		 int time=45;
		double totalFare=invoiceGenerator.calculateTotalFare(distance,time);
		 Assert.assertEquals(900.0, totalFare,0.0);
	}
	
	@Test
	public void givenDistanceAndTime_ShouldReturnMinFare() {
		double distance=0.1;
		 int time=1;
		double totalFare=invoiceGenerator.calculateTotalFare(distance,time);
		 Assert.assertEquals(5.0, totalFare,0.0);
	}
	@Test
	public void givenMultipleRides_ShouldReturnInvoiceSummary() {
		Ride[] rides= {new Ride(2.0,5),new Ride(0.1,1)};
		InvoiceSummary invoiceSummary=invoiceGenerator.calculateFare(rides);
		InvoiceSummary expectedSummary=new InvoiceSummary(2,27);
		Assert.assertEquals(expectedSummary, invoiceSummary);
	}
	
	
	 @Test
	    public void givenUserId_ShouldReturnInvoiceSummary() {

	        InvoiceService invoiceService = new InvoiceService();

	        String userId = "user1";
	        Ride[] rides = {
	                new Ride(2.0, 5),
	                new Ride(0.1, 1)
	        };

	        invoiceService.addRides(userId, rides);

	        InvoiceSummary summary = invoiceService.getInvoiceSummary(userId);

	        InvoiceSummary expectedSummary = new InvoiceSummary(2, 27);

	        Assert.assertEquals(expectedSummary, summary);
	    }
	 
	 @Test
	 public void givenPremiumRides_ShouldReturnInvoiceSummary() {
	     Ride[] rides = {
	             new Ride(2.0, 5, RideType.PREMIUM),
	             new Ride(0.1, 1, RideType.PREMIUM)
	     };

	     InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
	     InvoiceSummary summary = invoiceGenerator.calculateFare(rides);

	     // Ride1: 2*15 + 5*2 = 40
	     // Ride2: min fare = 20
	     // Total = 60
	     InvoiceSummary expected = new InvoiceSummary(2, 60);

	     Assert.assertEquals(expected, summary);
	 }
}
