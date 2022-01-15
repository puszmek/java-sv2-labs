package exceptions.measurement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

    Measurement measurement;
    List<String> data;

    @BeforeEach
    void setUp() {
        measurement = new Measurement();
        data = measurement.readFromFile(Paths.get("src/test/resources/measurementdata.csv"));
    }

    @Test
    void testReadFromFile() {
        assertEquals(11, data.size());
        assertEquals(true, data.get(1).endsWith("a"));
        assertEquals(true, data.get(4).contains("JohnDoe"));
        assertEquals(true, data.get(7).startsWith("a1"));
        assertEquals(true, data.get(10).endsWith(","));
    }

    @Test
    void testReadFromFileNotExist() {
        Exception exception = assertThrows(IllegalStateException.class,
                () -> measurement.readFromFile(Paths.get("src/test/resources/measurement0.csv")));
        assertEquals("Can not read file!", exception.getMessage());
    }

    @Test
    void testValidate() {
        List<String> incorrectLines = measurement.validate(data);
        assertEquals(8, incorrectLines.size());
        assertEquals("2,12.4,John Doe,a", incorrectLines.get(0));
        assertEquals("a,12.4,John Doe", incorrectLines.get(1));
        assertEquals("7,12a.4,John Doe", incorrectLines.get(5));
        assertEquals("9,12.4,", incorrectLines.get(7));
    }
}