package methodparam.sums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumsTest {

    @Test
    void testSums() {
        double[] numbers = {12.8, 25.7, -84.9, 72.1, -52.8, -15.6};
        Sums sums = new Sums();
        for (double actual : numbers) {
            sums.addNumber(actual);
        }
        assertEquals(110.6, sums.getSumOfPositiveNumbers(), 0.0005);
        assertEquals(-153.3, sums.getSumOfNegativeNumbers(), 0.0005);
    }
}