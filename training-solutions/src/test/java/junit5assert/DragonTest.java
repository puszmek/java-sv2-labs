package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DragonTest {

    @Test
    void testName() {
        Dragon dragon = new Dragon("Vörös", 2, 7.5);
        assertEquals("Vörös", dragon.getName());
        assertNotEquals("Zöld", dragon.getName());
    }

    @Test
    void testNumberOfHeads() {
        Dragon dragon = new Dragon("Zöld", 2, 7.5);
        assertEquals(2, dragon.getNumberOfHeads());
        assertTrue(dragon.getNumberOfHeads() == 2);
//        assertEquals(true, dragon.getNumberOfHeads() == 2);
        assertFalse(dragon.getNumberOfHeads() == 5);
//        assertEquals(false, dragon.getNumberOfHeads() == 5);
    }

    @Test
    void testHeight() {
        Dragon dragon = new Dragon("Zöld", 2, 7.5);
        assertEquals(7.5, dragon.getHeight(), 0.005);
    }

    @Test
    void testNull() {
        Dragon dragon = null;
        Dragon anotherdragon = new Dragon("Vörös", 3, 10.45);
        assertNull(dragon);
        assertNotNull(anotherdragon);
    }

    @Test
    void testSameObjects() {
        Dragon dragon = new Dragon("Vörös", 3, 10.45);
        Dragon anotherdragon = dragon;
        assertSame(dragon, anotherdragon);
    }

    @Test
    void testNotSameObjects() {
        Dragon dragon = new Dragon("Vörös", 3, 10.45);
        Dragon anotherdragon = new Dragon("Vörös", 3, 10.45);
//        assertSame(dragon, anotherdragon);   nem jó
        assertNotSame(dragon, anotherdragon);
    }
}
