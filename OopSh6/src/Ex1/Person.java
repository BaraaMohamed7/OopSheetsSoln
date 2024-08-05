package Ex1;

import java.util.*;

import static java.lang.StringTemplate.STR;

public class Person {

    private String id;
    private String name;
    private Gender gender;
    private double weight;
    private double height;
    private int age;
    private Address address;

    public Person(String name, Gender gender, double weight, double height, int age) {
        this.id = generateRandomId();
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double calculateBMI() {
        return weight / Math.pow(height / 100, 2);
    }

    public boolean isAdult() {
        return age >= 18;
    }

    @Override
    public String toString() {
        return STR."""
                \n\n
                name : \{name}
                age : \{age}
                id : \{id}
                Gender : \{gender}
                wieght : \{weight}
                height : \{height}
                """;
    }

    public String generateRandomId() {
        String newId ="";
        for (int i = 0; i <16; i++) {
            newId += (char) (48 + Math.floor(Math.random() * 74));
        }
        return newId;
    }

    public static Person fake() {
        String maleNames[] = {"Baraa", "Khaled", "Mohamed", "Ahmed"};
        String femaleNames[] = {"Hala", "Rana", "Basmala", "Hoda", "Sara"};
        Random random = new Random();

        Gender fakeGender = Gender.values()[random.nextInt(0,2)];
        String fakeName = fakeGender == Gender.Male?
                        maleNames[random.nextInt(0, maleNames.length -1)]:
                        femaleNames[random.nextInt(0, femaleNames.length -1)]
                ;
        double fakeWeight = random.nextDouble() * 100;
        double fakeHeight = random.nextDouble() * 200;
        int fakeAge = (int)(Math.random() * 90);

        Person fakePerson = new Person(fakeName,fakeGender,fakeWeight,fakeHeight,fakeAge);
        return fakePerson;
    }

    public static Person findMaxAge(Person[] people) {
        Person maxAgePerson =  people[0];

        for (int i = 0; i < people.length; i++) {
            if (people[i].getAge() > maxAgePerson.getAge()) maxAgePerson = people[i];
        }

        return maxAgePerson;
    }

    public static Person findMinAge(Person[] people) {
        Person minAgePerson =  people[0];

        for (int i = 0; i < people.length; i++) {
            if (people[i].getAge() < minAgePerson.getAge()) minAgePerson = people[i];
        }

        return minAgePerson;
    }

    public static double calculateAverageAge(Person[] people) {
        double sum = 0;
        for (int i = 0; i < people.length; i++) {
            sum+=people[i].age;
        }
        return sum / people.length;
    }

    public static void sortByAge(Person[] people) {
        for (int i = 0; i < people.length-1; i++) {
            for (int j = 0; j < people.length - i -1; j++) {
                if (people[j].age > people[j+1].age) {
                    Person temp = people[j];
                    people[j] = people[j+1];
                    people[j+1] = temp;
                }
            }
        }
    }

    public static void sortByWeight(Person[] people) {
        for (int i = 0; i < people.length-1; i++) {
            for (int j = 0; j < people.length - i -1; j++) {
                if (people[j].weight > people[j+1].weight) {
                    Person temp = people[j];
                    people[j] = people[j+1];
                    people[j+1] = temp;
                }
            }
        }
    }
}


