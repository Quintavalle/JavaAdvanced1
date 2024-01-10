import org.junit.Test;
import java.time.OffsetDateTime;
import static org.junit.Assert.assertEquals;

public class OffsetDateTimeInfoTest {

    @Test
    public void testGetYear() {
        String dateString = "2023-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateString);
        int year = OffsetDateTimeInfo.getYear(offsetDateTime);
        assertEquals(2023, year);
    }

    @Test
    public void testGetMonth() {
        String dateString = "2023-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateString);
        int month = OffsetDateTimeInfo.getMonth(offsetDateTime);
        assertEquals(3, month);
    }

    @Test
    public void testGetDay() {
        String dateString = "2023-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateString);
        int day = OffsetDateTimeInfo.getDay(offsetDateTime);
        assertEquals(1, day);
    }

    @Test
    public void testGetDayOfWeek() {
        String dateString = "2023-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateString);
        String dayOfWeek = OffsetDateTimeInfo.getDayOfWeek(offsetDateTime);
        assertEquals("Mercoledì", dayOfWeek);
    }

}
