package main.java;

public class InvoiceGenerator {

	public static final double minimumCostPerKilometer=10.0;
	public static final int costPerTime=1;
	
	public double calculateTotalFare(double distance, double time) {
		return distance*minimumCostPerKilometer+time*costPerTime;
		
	}

}
