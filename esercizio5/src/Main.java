public class Main {

    public static void main(String[] args) {
        // Blocco 1
        try {
            Integer numeratore = 5;
            Integer denominatore = null;

            checkFraction(numeratore, denominatore);
            System.out.println("Operazione nel blocco 1 eseguita con successo.");
        } catch (IllegalArgumentException e) {
            System.out.println("Errore nel blocco 1: " + e.getMessage());
        }

        // Blocco 2
        try {
            Integer numeratore = 10;
            Integer denominatore = 2;

            checkFraction(numeratore, denominatore);
            System.out.println("Operazione nel blocco 2 eseguita con successo.");
        } catch (IllegalArgumentException e) {
            System.out.println("Errore nel blocco 2: " + e.getMessage());
        }
    }

    private static void checkFraction(Integer numeratore, Integer denominatore) {
        if (numeratore == null || denominatore == null) {
            throw new IllegalArgumentException("Numeratore e denominatore non devono essere null.");
        }

    }
}
