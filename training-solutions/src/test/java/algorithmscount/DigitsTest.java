package algorithmscount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitsTest {

    @Test
    void testGetCountOfNumbers() {
        assertEquals(9, new Digits().getCountOfNumbers());
    }
}