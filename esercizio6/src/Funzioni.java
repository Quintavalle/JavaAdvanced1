public class Funzioni {

    public static void stampaSommaInt(int a, int b) {
        int somma = a + b;
        System.out.println("Somma di " + a + " e " + b + " = " + somma);
    }

    public static void stampaChar(char carattere) {
        System.out.println("Carattere: " + carattere);
    }

    public static void stampaSommaInteger(Integer a, Integer b) {
        Integer somma = a + b;
        System.out.println("Somma di " + a + " e " + b + " = " + somma);
    }

    public static void stampaCharacter(Character carattere) {
        System.out.println("Carattere: " + carattere);
    }

    public static void main(String[] args) {

        int valoreInt = 5;
        double valoreDouble = 3.14;
        char valoreChar = 'A';

        // Autoboxing
        Integer oggettoInt = valoreInt;
        Double oggettoDouble = valoreDouble;
        Character oggettoChar = valoreChar;

        // Unboxing
        int nuovoValoreInt = oggettoInt;
        double nuovoValoreDouble = oggettoDouble;
        char nuovoValoreChar = oggettoChar;


        stampaSommaInt(3, 7);
        stampaChar('X');
        stampaSommaInteger(10, 20);
        stampaCharacter('B');
    }
}
