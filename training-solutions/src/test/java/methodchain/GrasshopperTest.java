package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrasshopperTest {

    Grasshopper grasshopper = new Grasshopper();

    @Test
    void testCreate() {
        Grasshopper grasshopper = new Grasshopper();
        assertEquals(0, grasshopper.getPosition());
    }

     @Test
    void testHopOnce() {
         grasshopper.hopOnce(Direction.POSITIVE).hopOnce(Direction.POSITIVE).hopOnce(Direction.NEGATIVE);
         assertEquals(1, grasshopper.getPosition());
     }

    @Test
    void testMoveFromZeroToThreeWithFiveHops() {
        grasshopper.moveFromZeroToThreeWithFiveHops();
        assertEquals(3, grasshopper.getPosition());
    }
}