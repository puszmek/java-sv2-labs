package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {

    @Test
    void testGetMin() {
        List<Integer> temperatures = Arrays.asList(11, 15, 18, 18, 16, 12, 10);
        assertEquals(10, new Temperature().getMin(temperatures));
    }
}