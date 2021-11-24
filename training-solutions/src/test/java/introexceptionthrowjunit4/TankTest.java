package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TankTest {

    private Tank tank = new Tank();

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testModifyAngle() {
        assertEquals(0, tank.getAngle());
        tank.modifyAngle(-30);
        assertEquals(-30, tank.getAngle());
        tank.modifyAngle(80);
        assertEquals(50, tank.getAngle());
        tank.modifyAngle(-90);
        assertEquals(-40, tank.getAngle());

    }

    @Test(expected = IllegalArgumentException.class)
    public void testModifyAngle0() {
        tank.modifyAngle(-81);
    }

    @Test
    public void testModifyAngleRule() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("A tank lövegcsöve jobbra és balra is csak 80°-ot tud fordulni! A megadott értéknek -80 és 80 közötti számnak kell lennie!");
        tank.modifyAngle(81);
    }

    @Test
    public void testModifyAngleAssertThrows() {
        tank.modifyAngle(70);
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> tank.modifyAngle(11));
        assertEquals("A tank lövegcsöve jobbra és balra is csak 80°-ot tud fordulni! A megadott értéknek -80 és 80 közötti számnak kell lennie!", iae.getMessage());
    }
}
