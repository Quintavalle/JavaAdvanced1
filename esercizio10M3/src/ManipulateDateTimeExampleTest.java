import org.junit.Test;
import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;
import static org.junit.Assert.assertEquals;

public class ManipulateDateTimeExampleTest {

    @Test
    public void testManipulateDateTime() {

        String initialDateString = "2023-03-01T13:00:00Z";
        OffsetDateTime initialDateTime = OffsetDateTime.parse(initialDateString);

        OffsetDateTime plusOneYear = initialDateTime.plusYears(1);
        assertEquals("2024-03-01T13:00:00Z", plusOneYear.toString());

        OffsetDateTime minusOneMonth = plusOneYear.minusMonths(1);
        assertEquals("2024-02-01T13:00:00Z", minusOneMonth.toString());

        OffsetDateTime plusSevenDays = minusOneMonth.plusDays(7);
        assertEquals("2024-02-08T13:00:00Z", plusSevenDays.toString());
    }

    @Test(expected = DateTimeParseException.class)
    public void testInvalidDateTime() {

        String invalidDateString = "2023-03-01T13:00:00";
        OffsetDateTime invalidDateTime = OffsetDateTime.parse(invalidDateString);
    }
}
