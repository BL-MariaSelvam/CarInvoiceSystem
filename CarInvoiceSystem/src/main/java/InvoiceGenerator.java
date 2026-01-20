package main.java;

public class InvoiceGenerator {

	public static final double minimumCostPerKilometer=10.0;
	public static final int costPerTime=1;
	public static final double minimumFare=5.0;
	
	public double calculateTotalFare(double distance, double time) {
		double totalFare= distance*minimumCostPerKilometer+time*costPerTime;
		if(totalFare<minimumFare) {
			return minimumFare;
		}
		else {
			return totalFare;
		}
		
	}

}
