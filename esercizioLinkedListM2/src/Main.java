import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Fruit> fruits = new LinkedList<>();

        fruits.add(new Fruit("Mela"));
        fruits.add(new Fruit("Banana"));
        fruits.add(new Fruit("Arancia"));

        System.out.println("LinkedList originale:");
        for (Fruit fruit : fruits) {
            System.out.println(fruit.getName());
        }

        fruits.addFirst(new Fruit("Limone"));

        fruits.addLast(new Fruit("Kiwi"));

        System.out.println("\nLinkedList aggiornata:");
        for (Fruit fruit : fruits) {
            System.out.println(fruit.getName());
        }
    }
}
