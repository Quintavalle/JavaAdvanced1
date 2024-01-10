import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ManipulateDateTimeExample {

    public static void main(String[] args) {

        String dateString = "2023-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateString);

        offsetDateTime = offsetDateTime.plusYears(1);

        offsetDateTime = offsetDateTime.minusMonths(1);

        offsetDateTime = offsetDateTime.plusDays(7);

        String formattedResult = formatDateTime(offsetDateTime, "dd MMMM yyyy HH:mm:ss", Locale.ITALY);
        System.out.println("Risultato: " + formattedResult);
    }

    private static String formatDateTime(OffsetDateTime offsetDateTime, String pattern, Locale locale) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern, locale);
        return offsetDateTime.format(formatter);
    }
}
