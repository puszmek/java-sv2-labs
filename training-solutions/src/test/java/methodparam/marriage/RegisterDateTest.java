package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RegisterDateTest {

    @Test
    void testCreateRegisterDate() {
        RegisterDate registerDate = new RegisterDate("születés ideje", LocalDate.parse("1983-10-22"));
        assertEquals("születés ideje", registerDate.getDescription());
        assertEquals(LocalDate.of(1983, 10, 22), registerDate.getDate());
    }

    @Test
    void testCreateRegisterDateWithInvalidDescription() {
        LocalDate date = LocalDate.parse("1983-10-22");
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new RegisterDate(" ", date));
        assertEquals("Description must not be empty!", iae.getMessage());
    }

    @Test
    void testCreateRegisterDateWithInvalidDate() {
        LocalDate date = LocalDate.parse("2100-10-22");
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new RegisterDate("születés ideje", date));
        assertEquals("Date is invalid!", iae.getMessage());
    }
}