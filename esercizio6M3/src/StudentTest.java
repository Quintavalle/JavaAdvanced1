import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void testStudentCreation() {
        Student student = new Student("TestStudent", 25);

        assertEquals("TestStudent", student.getName());
        assertEquals(25, student.getAge());
    }

    @Test
    public void testArrayListAddition() {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("TestStudent1", 20));
        studentList.add(new Student("TestStudent2", 22));

        assertEquals(2, studentList.size());
    }
}