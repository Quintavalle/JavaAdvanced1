public class DivideArray {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 0, 8};

        try {
            processArray(numbers);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Errore: " + e.getMessage());
        } finally {
            System.out.println("Blocco di codice eseguito sempre.");
        }
    }

    public static void processArray(int[] array) {
        for (int i = 0; i <= array.length; i++) {
            try {
                int result = array[i] / 0;
                System.out.println("Il risultato della divisione è: " + result);
            } catch (ArithmeticException e) {
                throw new ArithmeticException("Tentativo di divisione per zero.");
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new ArrayIndexOutOfBoundsException("Indice non presente nell'array.");
            }
        }
    }
}
