import org.junit.Test;
import java.time.OffsetDateTime;
import static org.junit.Assert.assertTrue;

public class OffsetDateTimeFormatterTest {

    @Test
    public void testFormatDateTimeFull() {
        String dateString = "2002-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateString);
        String formattedDate = OffsetDateTimeFormatter.formatDateTime(offsetDateTime, "EEEE, MMMM dd, yyyy h:mm:ss a z");

        assertTrue(formattedDate.startsWith("Friday, March 01, 2002 1:00:00 PM"));
        assertTrue(formattedDate.endsWith("Coordinated Universal Time") || formattedDate.endsWith("UTC"));
    }

    @Test
    public void testFormatDateTimeMedium() {
        String dateString = "2002-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateString);
        String formattedDate = OffsetDateTimeFormatter.formatDateTime(offsetDateTime, "MMM dd, yyyy h:mm:ss a");

        assertTrue(formattedDate.startsWith("Mar 01, 2002 1:00:00 PM"));
    }

    @Test
    public void testFormatDateTimeShort() {
        String dateString = "2002-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateString);
        String formattedDate = OffsetDateTimeFormatter.formatDateTime(offsetDateTime, "MM/dd/yy h:mm a");

        assertTrue(formattedDate.startsWith("03/01/02 1:00 PM"));
    }
}

