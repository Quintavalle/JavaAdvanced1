import java.math.BigDecimal;

public class BigDecimalCalculator {

    public enum Operation {
        ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION, MINIMUM, MAXIMUM
    }

    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("20");
        BigDecimal num2 = new BigDecimal("7");
        Operation operation = Operation.DIVISION;

        BigDecimal result = performOperation(num1, num2, operation);

        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2: " + num2);
        System.out.println("Operazione: " + operation);
        System.out.println("Risultato: " + result);
    }

    public static BigDecimal performOperation(BigDecimal num1, BigDecimal num2, Operation operation) {
        switch (operation) {
            case ADDITION:
                return num1.add(num2);
            case SUBTRACTION:
                return num1.subtract(num2);
            case MULTIPLICATION:
                return num1.multiply(num2);
            case DIVISION:
                try {
                    return num1.divide(num2);
                } catch (ArithmeticException e) {
                    System.out.println("Errore nella divisione: " + e.getMessage());
                    return BigDecimal.ZERO;
                }
            case MINIMUM:
                return num1.min(num2);
            case MAXIMUM:
                return num1.max(num2);
            default:
                throw new IllegalArgumentException("Operazione non valida: " + operation);
        }
    }
}
