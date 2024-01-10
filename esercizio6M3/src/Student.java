import java.util.ArrayList;

public class Student {
    private String name;
    private int age;

    // Costruttore
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Metodi pubblici per ottenere informazioni
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Creazione di un ArrayList con n elementi
        ArrayList<Student> studentList = new ArrayList<>();

        // Stampa dell'ArrayList iniziale
        System.out.println("ArrayList iniziale:");
        stampaArrayList(studentList);

        // Aggiunta di 4 elementi alla collezione
        studentList.add(new Student("Alice", 20));
        studentList.add(new Student("Bob", 22));
        studentList.add(new Student("Charlie", 21));
        studentList.add(new Student("David", 23));

        // Stampa della collezione aggiornata
        System.out.println("\nArrayList aggiornato:");
        stampaArrayList(studentList);
    }

    // Metodo per stampare l'ArrayList
    private static void stampaArrayList(ArrayList<Student> list) {
        for (Student student : list) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}