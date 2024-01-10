import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class OffsetDateTimeExample {

    public static void main(String[] args) {

        String dateString = "2023-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateString);

        String formattedDate = formatDateTime(offsetDateTime, "dd MMMM yyyy");

        System.out.println("Data formattata: " + formattedDate);
    }

    static String formatDateTime(OffsetDateTime offsetDateTime, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return offsetDateTime.format(formatter);
    }
}
