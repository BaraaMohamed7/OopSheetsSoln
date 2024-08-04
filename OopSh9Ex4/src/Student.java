import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private int age;
    private double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "\n\nStudent : \n" +
                "name : " + name +
                "\n age : " + age +
                "\n score : " + score;
    }

    public static ArrayList<Student> readStudents(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        ArrayList<Student> students = new ArrayList<>();

        String line;
        while ((line = reader.readLine()) != null) {
            try {
               students.add(fromLine(line));
            } catch (StudentLineMismatchException e) {
                throw new RuntimeException(e);
            } finally {
                reader.close();
            }
        }

        return students;
    }

    public static Student fromLine(String line) throws StudentLineMismatchException {
        String[] data = line.split(" ");
        return new Student(data[0], Integer.parseInt(data[1]), Double.parseDouble(data[2]));
    }
}
