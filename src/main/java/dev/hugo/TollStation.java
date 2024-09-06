package dev.hugo;

import java.util.ArrayList;
import java.util.List;

class TollStation {
    private String name;
    private String city;
    private int totalCollected;
    private List<Vehicle> vehicles;

    public TollStation(String name, String city) {
        this.name = name;
        this.city = city;
        this.totalCollected = 0;
        this.vehicles = new ArrayList<>();
    } 

    public void registerVehicle(Vehicle vehicle) {
        int toll = vehicle.calculateToll();
        vehicles.add(vehicle);
        totalCollected += toll;
    }

    public void displayReport() {
        System.out.println("Toll Station: " + name + ", City: " + city);
        System.out.println("Vehicles that passed through the toll station:");
        for (Vehicle vehicle : vehicles) {
            String vehicleType = vehicle.getClass().getSimpleName();
            System.out.println("- " + vehicleType + " with license plate " + vehicle.getLicensePlate());
        }
        System.out.println("Total collected: $" + totalCollected);
    }

    public int getTotalCollected() {
        return totalCollected;
    }
}

