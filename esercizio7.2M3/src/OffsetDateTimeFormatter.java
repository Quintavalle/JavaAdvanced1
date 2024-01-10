import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class OffsetDateTimeFormatter {

    public static String formatDateTime(OffsetDateTime offsetDateTime, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return offsetDateTime.format(formatter);
    }

    public static void main(String[] args) {
        // Creazione di un oggetto OffsetDateTime dalla stringa
        String dateString = "2002-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateString);

        // Formattazione della data nei formati FULL, MEDIUM e SHORT
        String fullFormat = formatDateTime(offsetDateTime, "EEEE, MMMM dd, yyyy h:mm:ss a z");
        String mediumFormat = formatDateTime(offsetDateTime, "MMM dd, yyyy h:mm:ss a");
        String shortFormat = formatDateTime(offsetDateTime, "MM/dd/yy h:mm a");

        // Stampa delle versioni formattate
        System.out.println("FULL Format: " + fullFormat);
        System.out.println("MEDIUM Format: " + mediumFormat);
        System.out.println("SHORT Format: " + shortFormat);
    }
}
