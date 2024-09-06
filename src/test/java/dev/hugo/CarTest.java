package dev.hugo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testCarLicensePlate() {
        Car car = new Car("CAR123");
        assertEquals("CAR123", car.getLicensePlate());
    }

    @Test
    void testCarCalculateToll() {
        Car car = new Car("CAR123");
        assertEquals(100, car.calculateToll());
    }
}

