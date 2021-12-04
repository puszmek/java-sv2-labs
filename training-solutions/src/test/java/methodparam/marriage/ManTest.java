package methodparam.marriage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ManTest {

    Man man;

    @BeforeEach
    void init() {
        man = new Man("Kiss Péter");
    }

    @Test
    void testCreateMan() {
        assertEquals("Kiss Péter", man.getName());
    }

    @Test
    void testCreateManWithNullName() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Man(null));
        assertEquals("Name is invalid!", iae.getMessage());
    }

    @Test
    void testCreateManWithInvalidName() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Man("  KissPéter   "));
        assertEquals("Name is invalid!", iae.getMessage());
    }

    @Test
    void testAddGetRegisterDates() {
        man.addRegisterDate(new RegisterDate("születés ideje", LocalDate.parse("1983-10-22")));
        man.addRegisterDate(new RegisterDate("házasságkötés ideje", LocalDate.parse("2021-11-15")));
        assertEquals(2, man.getRegisterDates().size());
        assertEquals("házasságkötés ideje", man.getRegisterDates().get(1).getDescription());
        assertEquals("2021-11-15", man.getRegisterDates().get(1).getDate().toString());
    }
}