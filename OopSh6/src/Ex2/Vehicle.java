package Ex2;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private Passenger[] passengers;

    public int getNumberOfPassengers() {
        return passengers.length;
    }
}
