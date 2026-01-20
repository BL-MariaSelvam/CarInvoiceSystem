package main.java;

import java.util.HashMap;
import java.util.Map;

public class RideRepository {

    private Map<String, Ride[]> userRides = new HashMap<>();

    // Add rides for a user
    public void addRides(String userId, Ride[] rides) {
        userRides.put(userId, rides);
    }

    // Get rides for a user
    public Ride[] getRides(String userId) {
        return userRides.get(userId);
    }
}

