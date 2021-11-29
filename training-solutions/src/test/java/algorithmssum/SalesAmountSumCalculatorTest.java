package algorithmssum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesAmountSumCalculatorTest {

    @Test
    void testSumSalesAmount() {
        SalesAmountSumCalculator sasc = new SalesAmountSumCalculator();
        List<Salesperson> salesperson = Arrays.asList(
                new Salesperson("Kiss Péter", 1_000_000),
                new Salesperson("Nagy Lajos", 1_200_000),
                new Salesperson("Dóka Róbert", 900_000),
                new Salesperson("Kiss Ferenc", 1_100_000));
        assertEquals(4_200_000, sasc.sumSalesAmount(salesperson));
    }
}