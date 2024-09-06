package dev.hugo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TruckTest {

    @Test
    void testTruckLicensePlate() {
        Truck truck = new Truck("TRUCK123", 2);
        assertEquals("TRUCK123", truck.getLicensePlate());
    }

    @Test
    void testTruckCalculateToll() {
        Truck truck = new Truck("TRUCK123", 4);
        assertEquals(200, truck.calculateToll()); // 50 * 4 axles
    }
}

