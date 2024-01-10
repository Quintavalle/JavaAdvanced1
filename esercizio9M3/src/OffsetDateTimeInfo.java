import java.time.OffsetDateTime;
import java.util.Locale;

public class OffsetDateTimeInfo {

    public static int getYear(OffsetDateTime offsetDateTime) {
        return offsetDateTime.getYear();
    }

    public static int getMonth(OffsetDateTime offsetDateTime) {
        return offsetDateTime.getMonthValue();
    }

    public static int getDay(OffsetDateTime offsetDateTime) {
        return offsetDateTime.getDayOfMonth();
    }

    public static String getDayOfWeek(OffsetDateTime offsetDateTime) {
        return offsetDateTime.getDayOfWeek().toString().toLowerCase(Locale.getDefault());
    }

    public static void main(String[] args) {
        // Creazione di un oggetto OffsetDateTime dalla stringa
        String dateString = "2023-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateString);

        // Ottenere l'anno, il mese, il giorno e il giorno della settimana
        int year = getYear(offsetDateTime);
        int month = getMonth(offsetDateTime);
        int day = getDay(offsetDateTime);
        String dayOfWeek = getDayOfWeek(offsetDateTime);

        // Stampa dei risultati sulla console
        System.out.println("Anno: " + year);
        System.out.println("Mese: " + month);
        System.out.println("Giorno: " + day);
        System.out.println("Giorno della settimana: " + capitalizeFirstLetter(dayOfWeek));
    }

    // Metodo per capitalizzare la prima lettera di una stringa
    private static String capitalizeFirstLetter(String str) {
        return str.substring(0, 1).toUpperCase(Locale.getDefault()) + str.substring(1);
    }
}


