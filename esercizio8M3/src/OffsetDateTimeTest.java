import org.junit.Test;
import java.time.OffsetDateTime;
import static org.junit.Assert.assertEquals;

public class OffsetDateTimeTest {

    @Test
    public void testFormatDateTime() {
        String dateString = "2023-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateString);

        String formattedDate = OffsetDateTimeExample.formatDateTime(offsetDateTime, "dd MMMM yyyy");

        assertEquals("01 marzo 2023", formattedDate);
    }
}
