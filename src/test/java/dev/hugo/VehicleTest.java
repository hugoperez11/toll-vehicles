package dev.hugo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void testVehicleLicensePlate() {
        Vehicle car = new Car("ABC123");
        assertEquals("ABC123", car.getLicensePlate());
    }
}

