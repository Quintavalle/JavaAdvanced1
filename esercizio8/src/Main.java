import java.util.HashSet;

public class Main {

    public static HashSet<String> creaEVerificaHashSet() {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Elemento1");
        hashSet.add("Elemento2");
        hashSet.add("Elemento3");

        String nuovoElemento = "Elemento2";

        nuovoElemento += " Modificato";

        boolean isParteDelSet = hashSet.contains(nuovoElemento);

        System.out.println("L'elemento '" + nuovoElemento + "' è parte del Set: " + isParteDelSet);

        return hashSet;
    }

    public static void main(String[] args) {

        HashSet<String> mioHashSet = creaEVerificaHashSet();

        mioHashSet.add("Elemento4");

        System.out.println("Elementi dell'HashSet: " + mioHashSet);
    }
}
