package methodstructure.bmi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyMassTest {

    @Test
    void testCreateBodyMass() {
        BodyMass bodyMass = new BodyMass(70, 1.8);
        assertEquals(70, bodyMass.getWeight());
        assertEquals(1.8, bodyMass.getHeight());
    }

    @Test
    void testGetBodyMassIndex() {
        BodyMass bodyMass = new BodyMass(70, 1.8);
        assertEquals(21.6, bodyMass.getBodyMassIndex(), 0.05);
    }

    @Test
    void testGetBody() {
        BodyMass bodyMass = new BodyMass(70, 1.8);
        BodyMass bodyMassUnder = new BodyMass(50, 1.8);
        BodyMass bodyMassOver = new BodyMass(100, 1.8);
        assertEquals(BmiCategory.NORMAL, bodyMass.getBody());
        assertEquals(BmiCategory.UNDERWEIGHT, bodyMassUnder.getBody());
        assertEquals(BmiCategory.OVERWEIGHT, bodyMassOver.getBody());
    }

    @Test
    void testIsThinnerThan() {
        BodyMass bodyMass = new BodyMass(70, 1.8);
        BodyMass bodyMassUnder = new BodyMass(50, 1.8);
        assertTrue(bodyMassUnder.isThinnerThan(bodyMass));
        assertFalse(bodyMass.isThinnerThan(bodyMassUnder));
        assertFalse(bodyMass.isThinnerThan(bodyMass));
    }
}