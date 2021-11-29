package algorithmsmax.hill;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HillTest {

    @Test
    void testHill(){
        List<Integer> heights = Arrays.asList(525, 884, 651, 728, 884);
        assertEquals(884, new Hill().getMax(heights));
    }
}