public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int Fast = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";


    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on) {
            return String.format("speed= %s , radius= %s , color = % s", speed, radius, color);

        } else {
            return String.format("Fan is off, radius= %s , color = % s", radius, color);
        }
    }
}
