import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> students = Student.readStudents("students.txt");
        System.out.println(students.toString());
    }
}