package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TankTest {

    Tank tank = new Tank();

    @Test
    void testModifyAngle() {
        assertEquals(0, tank.getAngle());
        tank.modifyAngle(70);
        assertEquals(70, tank.getAngle());
        tank.modifyAngle(-150);
        assertEquals(280, tank.getAngle());
        tank.modifyAngle(-1024);
        tank.modifyAngle(1036);
        assertEquals(292, tank.getAngle());
    }

    @Test
    void testModifyAngleAssertThrows() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> tank.modifyAngle(1900));
        assertEquals("A fordulás szöge nem eshet 80° és 280° közé!", iae.getMessage());
    }
}
