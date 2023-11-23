import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("d", 4);
        hashMap.put("a", 1);
        hashMap.put("c", 3);
        hashMap.put("b", 2);

        TreeMap<String, Integer> sortedMap = new TreeMap<>(hashMap);

        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
