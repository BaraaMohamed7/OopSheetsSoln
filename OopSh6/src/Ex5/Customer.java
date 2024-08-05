package Ex5;

import Ex1.Gender;
import Ex1.Person;

import java.util.Arrays;

public class Customer extends Person {

    public Customer(String name, Gender gender, double weight, double height, int age) {
        super(name, gender, weight, height, age);
    }

    private String  phone;
    private String customerId;
    private Order[] orders;

    public double getTotalAmount() {
     return Arrays.stream(orders).mapToDouble(Order::getTotal).sum();
    }
}
