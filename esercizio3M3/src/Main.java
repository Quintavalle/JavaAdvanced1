import java.time.OffsetDateTime;
import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        String inputDate = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = OffsetDateTime.parse(inputDate);

        int year = dateTime.getYear();
        int month = dateTime.getMonthValue();
        int day = dateTime.getDayOfMonth();
        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();

        System.out.println("Anno: " + year);
        System.out.println("Mese: " + month);
        System.out.println("Giorno: " + day);
        System.out.println("Giorno della settimana: " + dayOfWeek);
    }
}
