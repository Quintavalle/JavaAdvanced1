import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static HashSet<String> creaEManipolaHashSet() {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Elemento1");
        hashSet.add("Elemento2");
        hashSet.add("Elemento3");

        String oggettoDaEliminare = "Elemento2";

        oggettoDaEliminare += " Modificato";

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String elemento = iterator.next();
            if (elemento.equals(oggettoDaEliminare)) {
                iterator.remove();
            }
        }

        hashSet.clear();

        System.out.println("HashSet vuoto: " + hashSet.isEmpty());

        return hashSet;
    }

    public static void main(String[] args) {

        HashSet<String> mioHashSet = creaEManipolaHashSet();
    }
}
