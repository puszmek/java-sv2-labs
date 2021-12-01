package immutable;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MonumentTest {

    @Test
    void testCreateMonument() {
        Monument monument = new Monument("Plébániatemplom", "5342 Kukutyin, Fő utca 3.",
                LocalDate.of(2015, 2, 4), "MRN-4326-T");
        assertEquals("Plébániatemplom", monument.getName());
        assertEquals("5342 Kukutyin, Fő utca 3.", monument.getAddress());
        assertEquals(LocalDate.of(2015, 2, 4), monument.getDateOfRegistry());
        assertEquals("MRN-4326-T", monument.getRegistryNumber());
    }

    @Test
    void testCreateMonumentWithNullName() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> new Monument(null, "5342 Kukutyin, Fő utca 3.",
                        LocalDate.of(2015, 2, 4), "MRN-4326-T"));
        assertEquals("A megnevezés, cím és nyilvántartásba vételi szám nem lehet üres!", ex.getMessage());
    }

    @Test
    void testCreateMonumentWithEmptyName() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> new Monument("   ", "5342 Kukutyin, Fő utca 3.",
                        LocalDate.of(2015, 2, 4), "MRN-4326-T"));
        assertEquals("A megnevezés, cím és nyilvántartásba vételi szám nem lehet üres!", ex.getMessage());
    }

    @Test
    void testCreateMonumentWithNullAddress() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> new Monument("Plébániatemplom", null,
                        LocalDate.of(2015, 2, 4), "MRN-4326-T"));
        assertEquals("A megnevezés, cím és nyilvántartásba vételi szám nem lehet üres!", ex.getMessage());
    }

    @Test
    void testCreateMonumentWithEmptyAddress() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> new Monument("Plébániatemplom", null,
                        LocalDate.of(2015, 2, 4), "MRN-4326-T"));
        assertEquals("A megnevezés, cím és nyilvántartásba vételi szám nem lehet üres!", ex.getMessage());
    }

    @Test
    void testCreateMonumentWithNullRegistryNumber() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> new Monument("Plébániatemplom", "5342 Kukutyin, Fő utca 3.",
                        LocalDate.of(2015, 2, 4), null));
        assertEquals("A megnevezés, cím és nyilvántartásba vételi szám nem lehet üres!", ex.getMessage());
    }

    @Test
    void testCreateMonumentWithEmptyRegistryNumber() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> new Monument("Plébániatemplom", "5342 Kukutyin, Fő utca 3.",
                        LocalDate.of(2015, 2, 4), "   "));
        assertEquals("A megnevezés, cím és nyilvántartásba vételi szám nem lehet üres!", ex.getMessage());
    }
}