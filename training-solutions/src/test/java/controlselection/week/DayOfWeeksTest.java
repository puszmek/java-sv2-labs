package controlselection.week;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayOfWeeksTest {

    @Test
    void testDayOfWeeks() {
        assertEquals("hét eleje", new DayOfWeeks().partsOfWeek("hétfő"));
        assertEquals("hét közepe", new DayOfWeeks().partsOfWeek("csütörtök"));
        assertEquals("majdnem hétvége", new DayOfWeeks().partsOfWeek("péntek"));
        assertEquals("hét vége", new DayOfWeeks().partsOfWeek("szombat"));
    }

    @Test
    void testCase() {
        assertEquals("hét közepe", new DayOfWeeks().partsOfWeek("KEdd"));
    }

    @Test
    void testIllegalDay() {
        assertEquals("ismeretlen nap", new DayOfWeeks().partsOfWeek("sombat"));
    }
}
