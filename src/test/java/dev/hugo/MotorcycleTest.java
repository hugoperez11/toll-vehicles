package dev.hugo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {

    @Test
    void testMotorcycleLicensePlate() {
        Motorcycle motorcycle = new Motorcycle("MOTO123");
        assertEquals("MOTO123", motorcycle.getLicensePlate());
    }

    @Test
    void testMotorcycleCalculateToll() {
        Motorcycle motorcycle = new Motorcycle("MOTO123");
        assertEquals(50, motorcycle.calculateToll());
    }
}

