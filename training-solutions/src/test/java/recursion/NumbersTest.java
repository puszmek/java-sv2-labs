package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void testGetSum() {
        assertEquals(10, new Numbers().getSum(new int[]{1, 2, 3, 4}));
        assertEquals(2, new Numbers().getSum(new int[]{2}));
        assertEquals(1, new Numbers().getSum(new int[]{1}));
        assertEquals(0, new Numbers().getSum(new int[]{}));
    }
}