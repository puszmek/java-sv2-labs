package algorithmssum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalespersonTest {

    @Test
    void testCreateSalesperson() {
        Salesperson salesperson = new Salesperson("Kiss Péter", 10000000);
        assertEquals("Kiss Péter", salesperson.getName());
        assertEquals(10000000, salesperson.getAmount());
    }
}