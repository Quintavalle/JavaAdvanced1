public class CharNumberChecker {
    public static void main(String[] args) {
        char characterToCheck = '5';

        try {
            checkIfNumber(characterToCheck);
            System.out.println(characterToCheck + " è un numero.");
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }

    public static void checkIfNumber(char character) {
        if (!Character.isDigit(character)) {
            throw new IllegalArgumentException("Il carattere non è un numero.");
        }
    }
}
