package dev.hugo;

public class TollSystem {
    public static void main(String[] args) {
        TollStation tollStation = new TollStation("Main Toll Station", "Central City");

       
        Vehicle vehicle1 = new Car("ABC123");
        Vehicle vehicle2 = new Motorcycle("XYZ789");
        Vehicle vehicle3 = new Truck("DEF456", 3); 

      
        tollStation.registerVehicle(vehicle1);
        tollStation.registerVehicle(vehicle2);
        tollStation.registerVehicle(vehicle3);

     
        tollStation.displayReport();
    }
}

