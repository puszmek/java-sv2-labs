package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HeightTest {

    @Test
    void testCountChildrenWithHeightGreaterThan() {
        Height height = new Height();
        List<Integer> heights = Arrays.asList(110, 114, 100, 125, 111, 109);
        assertEquals(4, height.countChildrenWithHeightGreaterThan(heights, 110));
    }
}