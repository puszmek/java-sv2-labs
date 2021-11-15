package controlselection.month;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayInMonthTest {

    @Test
    void testNumberOfDays() {
        DayInMonth dayInMonth = new DayInMonth();
        assertEquals(30, dayInMonth.numberOfDays(2021, "április"));
        assertEquals(31, dayInMonth.numberOfDays(2021, "január"));
        assertEquals(28, dayInMonth.numberOfDays(2021, "február"));
    }

    @Test
    void testLeapYear400() {
        assertEquals(29, new DayInMonth().numberOfDays(2000, "február"));
    }

    @Test
    void testLeapYear100() {
        assertEquals(28, new DayInMonth().numberOfDays(2100, "február"));
    }

    @Test
    void testCase() {
        assertEquals(30, new DayInMonth().numberOfDays(2021, "JÚniUS"));
    }

    @Test
    void testIllegalMonth() {
        assertEquals(0, new DayInMonth().numberOfDays(2021, "januát"));
    }
}
