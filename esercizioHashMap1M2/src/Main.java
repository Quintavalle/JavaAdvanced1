import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {

        // Inizializzazione tramite costruttore
        Map<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("Uno", 1);
        hashMap1.put("Due", 2);
        hashMap1.put("Tre", 3);

        // Inizializzazione tramite metodo statico of()
        Map<String, Integer> hashMap2 = Map.of("A", 10, "B", 20, "C", 30);

        // Inizializzazione tramite metodo Map.ofEntries()
        Entry<String, Integer> entry1 = Map.entry("X", 100);
        Entry<String, Integer> entry2 = Map.entry("Y", 200);
        Entry<String, Integer> entry3 = Map.entry("Z", 300);
        Map<String, Integer> hashMap3 = Map.ofEntries(entry1, entry2, entry3);

        System.out.println("HashMap 1:");
        stampaContenuto(hashMap1);

        System.out.println("HashMap 2:");
        stampaContenuto(hashMap2);

        System.out.println("HashMap 3:");
        stampaContenuto(hashMap3);
    }

    private static void stampaContenuto(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
