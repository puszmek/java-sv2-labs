package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NumbersTest {

    @Test
    void testGetEvenNumbers() {
        Numbers number = new Numbers();
        int[] numbers = new int[] {2, 8, 5, 6, 2, 3, 9};
        int[] result = new int[] {2, 8, 0, 6, 2, 0, 0};
        assertArrayEquals(result, number.getEvenNumbers(numbers));
    }
}
