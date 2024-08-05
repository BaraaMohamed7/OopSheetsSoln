package Ex3;

import Ex1.Gender;
import Ex1.Person;

public class Student extends Person {
    private String studentId;
    private String major;
    private Course[] courses;

    public Student(String name, Gender gender, double weight, double height, int age) {
        super(name, gender, weight, height, age);
    }

    public int getTotalCreditHours() {
        int sum = 0;
        for (int i = 0; i < courses.length; i++) {
            sum += courses[i].getCreditHours();
        }
        return sum;
    }
}
