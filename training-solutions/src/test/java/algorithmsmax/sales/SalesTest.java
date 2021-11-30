package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesTest {

    List<Salesperson> salespersons = Arrays.asList(
            new Salesperson("Kiss Péter", 1_000_000, 800_000),
            new Salesperson("Lázár Emil", 1_000_000, 400_000),
            new Salesperson("Kovács Béla", 700_000, 800_000),
            new Salesperson("Nagy Vince", 450_000, 400_000));

    @Test
    void testSelectSalesPersonWithMaxSalesAmount() {
        Sales maxSalesAmount = new Sales();
        assertEquals(1_000_000, maxSalesAmount.selectSalesPersonWithMaxSalesAmount(salespersons).getAmount());
    }

    @Test
    void testSelectSalesPersonWithFurthestAboveTarget() {
        Sales maxTarget = new Sales();
        assertEquals(600_000, maxTarget.selectSalesPersonWithFurthestAboveTarget(salespersons).getDifferenceFromTarget());
        assertEquals(1_000_000, maxTarget.selectSalesPersonWithFurthestAboveTarget(salespersons).getAmount());
        assertEquals(400_000, maxTarget.selectSalesPersonWithFurthestAboveTarget(salespersons).getTarget());
    }

    @Test
    void testSelectSalesPersonWithFurthestBelowTarget() {
        Sales minTarget = new Sales();
        assertEquals(-100_000, minTarget.selectSalesPersonWithFurthestBelowTarget(salespersons).getDifferenceFromTarget());
        assertEquals(700_000, minTarget.selectSalesPersonWithFurthestBelowTarget(salespersons).getAmount());
        assertEquals(800_000, minTarget.selectSalesPersonWithFurthestBelowTarget(salespersons).getTarget());
    }
}