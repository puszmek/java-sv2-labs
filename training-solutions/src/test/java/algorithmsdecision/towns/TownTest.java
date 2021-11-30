package algorithmsdecision.towns;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TownTest {

    @Test
    void testContainsFewerHabitants() {
        List<Integer> habitants = Arrays.asList(124005, 54126, 78459, 2145, 165842);
        assertTrue(new Town().containsFewerHabitants(habitants, 10000));
        assertFalse(new Town().containsFewerHabitants(habitants, 2000));
    }
}