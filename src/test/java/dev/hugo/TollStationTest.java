package dev.hugo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TollStationTest {

    private TollStation tollStation;

    @BeforeEach
    void setUp() {
        tollStation = new TollStation("Main Toll", "Springfield");
    }

    @Test
    void testRegisterCar() {
        Car car = new Car("CAR123");
        tollStation.registerVehicle(car);
  
        assertEquals(100, tollStation.getTotalCollected());
    }

    @Test
    void testRegisterMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("MOTO123");
        tollStation.registerVehicle(motorcycle);
 
        assertEquals(50, tollStation.getTotalCollected());
    }

    @Test
    void testRegisterTruckWithTwoAxles() {
        Truck truck = new Truck("TRUCK123", 2);
        tollStation.registerVehicle(truck);
   
        assertEquals(100, tollStation.getTotalCollected());
    }

    @Test
    void testRegisterMultipleVehicles() {
        Car car = new Car("CAR123");
        Motorcycle motorcycle = new Motorcycle("MOTO123");
        Truck truck = new Truck("TRUCK456", 4);

        tollStation.registerVehicle(car);
        tollStation.registerVehicle(motorcycle);
        tollStation.registerVehicle(truck);

        assertEquals(350, tollStation.getTotalCollected());
    }

    @Test
    void testDisplayReport() {
        Car car = new Car("CAR123");
        tollStation.registerVehicle(car);

       
        assertEquals(100, tollStation.getTotalCollected());
    }
}

