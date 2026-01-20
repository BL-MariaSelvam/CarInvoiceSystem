package main.java;

public class Ride {
    double distance;
    int time;
    RideType rideType;

    public Ride(double distance, int time, RideType rideType) {
        this.distance = distance;
        this.time = time;
        this.rideType = rideType;
    }

	public Ride(double distance2, int time2) {
		  this.distance = distance2;
	        this.time = time2;
	}
}
