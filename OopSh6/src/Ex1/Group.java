package Ex1;

import java.util.ArrayList;

public class Group {
    Person[] people;

    public int averageAge() {
        int sum = 0;
        for (int i = 0; i < people.length; i++) {
            sum += people[i].getAge();
        }
        return sum / people.length;
    }
}
