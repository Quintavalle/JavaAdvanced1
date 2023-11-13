import java.util.HashSet;

public class Main {

    public static HashSet<String> creaEStampaHashSet() {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Elemento1");
        hashSet.add("Elemento2");
        hashSet.add("Elemento3");

        System.out.println("Grandezza dell'HashSet: " + hashSet.size());
        System.out.println("Elementi dell'HashSet: " + hashSet);

        return hashSet;
    }

    public static void main(String[] args) {

        HashSet<String> mioHashSet = creaEStampaHashSet();

        mioHashSet.add("Elemento4");

        System.out.println("Nuova grandezza dell'HashSet: " + mioHashSet.size());
        System.out.println("Nuovi elementi dell'HashSet: " + mioHashSet);
    }
}
