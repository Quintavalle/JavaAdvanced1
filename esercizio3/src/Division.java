public class Division {
    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }

    public static void divideByZero() {
        int numerator = 10;
        int denominator = 0;

        try {
            int result = numerator / denominator;
            System.out.println("Il risultato della divisione è: " + result);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Tentativo di divisione per zero.");
        }
    }
}
