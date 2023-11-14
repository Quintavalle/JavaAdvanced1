import java.util.ArrayList;
import java.util.Collections;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Aggiungi 12 studenti all'ArrayList
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 22));
        students.add(new Student("Charlie", 21));
        students.add(new Student("David", 19));
        students.add(new Student("Eva", 23));
        students.add(new Student("Frank", 20));
        students.add(new Student("Grace", 22));
        students.add(new Student("Hank", 21));
        students.add(new Student("Ivy", 19));
        students.add(new Student("Jack", 23));
        students.add(new Student("Karen", 20));
        students.add(new Student("Leo", 22));

        // Stampa la lista non ordinata
        System.out.println("Lista non ordinata:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Ordina la lista in base all'età degli studenti
        Collections.sort(students, (s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()));

        // Stampa la lista ordinata
        System.out.println("\nLista ordinata per età:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
