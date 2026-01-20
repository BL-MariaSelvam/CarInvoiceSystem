package main.java;

public enum RideType {
    NORMAL(10.0, 1, 5.0),
    PREMIUM(15.0, 2, 20.0);

    public final double costPerKm;
    public final int costPerMinute;
    public final double minimumFare;

    RideType(double costPerKm, int costPerMinute, double minimumFare) {
        this.costPerKm = costPerKm;
        this.costPerMinute = costPerMinute;
        this.minimumFare = minimumFare;
    }
}

