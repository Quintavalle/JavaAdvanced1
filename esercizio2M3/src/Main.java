import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String inputDate = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = OffsetDateTime.parse(inputDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM uuuu", Locale.ITALIAN);
        String formattedDate = formatter.format(dateTime);

        System.out.println(formattedDate);
    }
}
