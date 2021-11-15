package controliteration.day;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayTest {

    Day day;

    @BeforeEach
    void setHour() {
        day = new Day();
        day.addHour(new Hour(2));
        day.addHour(new Hour(6));
        day.addHour(new Hour(14));
        day.addHour(new Hour(22));
        day.addHour(new Hour(23));
    }

    @Test
    void testSetDayPeriod() {
        day.setDayPeriod();
        assertEquals(DayPeriod.NIGHTTIME, day.getHoursOfDay().get(0).getPeriod());
        assertEquals(DayPeriod.NIGHTTIME, day.getHoursOfDay().get(1).getPeriod());
        assertEquals(DayPeriod.DAYTIME, day.getHoursOfDay().get(2).getPeriod());
        assertEquals(DayPeriod.NIGHTTIME, day.getHoursOfDay().get(3).getPeriod());
        assertEquals(DayPeriod.NIGHTTIME, day.getHoursOfDay().get(4).getPeriod());
    }
}
