package main.test;

import java.util.Objects;

public class InvoiceSummary {
	
	private final int numOfRide;
	private final double totalFare;
	private final double averageFare;
	public InvoiceSummary(int numOfRide, double totalFare) {
		super();
		this.numOfRide = numOfRide;
		this.totalFare = totalFare;
		this.averageFare=this.totalFare/numOfRide;
	}
	
	@Override
	public int hashCode() {
	    return Objects.hash(numOfRide, totalFare, averageFare);
	}
	 	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceSummary other = (InvoiceSummary) obj;
		return Double.doubleToLongBits(averageFare) == Double.doubleToLongBits(other.averageFare)
				&& numOfRide == other.numOfRide
				&& Double.doubleToLongBits(totalFare) == Double.doubleToLongBits(other.totalFare);
	}
	

}
