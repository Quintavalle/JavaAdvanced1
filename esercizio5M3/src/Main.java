import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        String inputDate1 = "2023-03-01T13:00:00Z";
        String inputDate2 = "2024-03-01T13:00:00Z";

        OffsetDateTime dateTime1 = OffsetDateTime.parse(inputDate1);
        OffsetDateTime dateTime2 = OffsetDateTime.parse(inputDate2);

        boolean isFirstBeforeSecond = dateTime1.isBefore(dateTime2);

        boolean isSecondAfterFirst = dateTime2.isAfter(dateTime1);

        boolean areEqual = dateTime1.isEqual(dateTime2);

        System.out.println("La prima data è precedente alla seconda: " + isFirstBeforeSecond);
        System.out.println("La seconda data è successiva alla prima: " + isSecondAfterFirst);
        System.out.println("Le due date sono uguali: " + areEqual);
    }
}
