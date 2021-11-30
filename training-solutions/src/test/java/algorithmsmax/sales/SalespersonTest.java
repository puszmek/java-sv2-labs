package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalespersonTest {

    @Test
    void testCreateSalesperson() {
        Salesperson person = new Salesperson("Kiss Péter", 1_000_000, 500_000);
        assertEquals("Kiss Péter", person.getName());
        assertEquals(1_000_000, person.getAmount());
        assertEquals(500_000, person.getTarget());
    }

    @Test
    void testGetDifferenceFromTarget() {
        Salesperson person = new Salesperson("Kiss Péter", 1_000_000, 600_000);
        Salesperson anotherPerson = new Salesperson("Kiss Péter", 1_000_000, 1_400_000);
        assertEquals(400_000, person.getDifferenceFromTarget());
        assertEquals(-400_000, anotherPerson.getDifferenceFromTarget());
    }
}