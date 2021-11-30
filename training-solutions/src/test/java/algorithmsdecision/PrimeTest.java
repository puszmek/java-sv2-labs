package algorithmsdecision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void testIsPrime() {
        assertTrue(new Prime().isPrime(2));
        assertTrue(new Prime().isPrime(29));
        assertFalse(new Prime().isPrime(1));
        assertFalse(new Prime().isPrime(66));
    }
}