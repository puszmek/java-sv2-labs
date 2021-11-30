package algorithmstransformation.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testCreatePerson() {
        Person person = new Person("Kiss Péter", 34, "6000 Kecskemét, Kerekes utca 28.");
        assertEquals("Kiss Péter", person.getName());
        assertEquals(34, person.getAge());
        assertEquals("6000 Kecskemét, Kerekes utca 28.", person.getAddress());
    }
}