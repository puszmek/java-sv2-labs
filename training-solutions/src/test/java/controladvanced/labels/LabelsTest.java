package controladvanced.labels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LabelsTest {

    @Test
    void testGetTableOfNumbers() {
        Labels labels = new Labels();
        int[][] table = labels.getTableOfNumbers(5);
        assertEquals(6, table[1][3]);
        assertEquals(9, table[4][3]);
    }
}
