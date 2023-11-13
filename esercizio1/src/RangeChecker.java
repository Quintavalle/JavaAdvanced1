public class RangeChecker {
    public static void main(String[] args) {
        try {
            int numberToCheck = 15;
            int lowerBound = 10;
            int upperBound = 20;

            if (isInRange(numberToCheck, lowerBound, upperBound)) {
                System.out.println(numberToCheck + " è nel range.");
            } else {
                System.out.println(numberToCheck + " non è nel range.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }

    public static boolean isInRange(int number, int lowerBound, int upperBound) {
        if (number >= lowerBound && number <= upperBound) {
            return true;
        } else {
            throw new IllegalArgumentException("Il numero non è nel range specificato.");
        }
    }
}
