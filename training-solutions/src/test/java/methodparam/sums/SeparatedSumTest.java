package methodparam.sums;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class SeparatedSumTest {

    @Test
    void testSeparatedSum() throws IOException {
        SeparatedSum separatedSum = new SeparatedSum();
        String numbers = separatedSum.readFile();
        Sums sums = separatedSum.sum(numbers);
        assertEquals(110.6, sums.getSumOfPositiveNumbers(), 0.005);
        assertEquals(-153.3, sums.getSumOfNegativeNumbers(), 0.005);
    }
}