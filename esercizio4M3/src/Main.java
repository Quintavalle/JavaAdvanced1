import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String inputDate = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = OffsetDateTime.parse(inputDate);

        dateTime = dateTime.plusYears(1);
        dateTime = dateTime.minusMonths(1);
        dateTime = dateTime.plusDays(7);

        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("dd MMMM yyyy", Locale.ITALY);
        String formattedDate = dateTime.format(formatter);

        System.out.println("Data localizzata per l'Italia: " + formattedDate);
    }
}
