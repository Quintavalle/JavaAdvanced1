import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String inputDate = "2002-03-01T13:00:00Z";
        OffsetDateTime dateTime = OffsetDateTime.parse(inputDate);

        DateTimeFormatter fullFormatter = DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy", java.util.Locale.getDefault());
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofPattern("d MMM yyyy", java.util.Locale.getDefault());
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofPattern("dd/MM/yy", java.util.Locale.getDefault());

        String formattedFull = fullFormatter.format(dateTime);
        String formattedMedium = mediumFormatter.format(dateTime);
        String formattedShort = shortFormatter.format(dateTime);

        System.out.println("FULL: " + formattedFull);
        System.out.println("MEDIUM: " + formattedMedium);
        System.out.println("SHORT: " + formattedShort);
    }
}
