package main.java;

import main.test.InvoiceSummary;

public class InvoiceGenerator {

    public double calculateTotalFare(Ride ride) {
        double fare = ride.distance * ride.rideType.costPerKm
                    + ride.time * ride.rideType.costPerMinute;

        return Math.max(fare, ride.rideType.minimumFare);
    }

    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalFare = 0.0;
        for (Ride ride : rides) {
            totalFare += calculateTotalFare(ride);
        }
        return new InvoiceSummary(rides.length, totalFare);
    }
    
 // Method required by test cases
    public double calculateTotalFare(double distance, int time) {
        Ride ride = new Ride(distance, time);
        return calculateTotalFare(ride);
    }
}
