package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShipTest {

    Ship ship;

    @BeforeEach
    void init() {
        ship = new Ship("Sun", 2010, 10.5);
    }

    @Test
    void testName() {
        assertEquals("Sun", ship.getName());
        assertNotEquals("Sunny", ship.getName());
    }

    @Test
    void testYearOfConstruction() {
        assertEquals(2010, ship.getYearOfConstruction());
        assertTrue(ship.getYearOfConstruction() == 2010);
        assertFalse(ship.getYearOfConstruction() == 2011);
    }

    @Test
    void testLength() {
        assertEquals(10.5, ship.getLength(), 0.005);
    }

    @Test
    void testNull() {
        Ship anotherShip = null;
        assertNull(anotherShip);
        assertNotNull(ship);
    }

    @Test
    void testSameObjects() {
        Ship anotherShip = ship;
        assertSame(anotherShip, ship);
    }

    @Test
    void testNotSameObjects() {
        Ship anotherShip = new Ship("Sun", 2010, 10.5);
        assertNotSame(anotherShip, ship);
    }
}
