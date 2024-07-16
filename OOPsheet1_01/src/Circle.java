public class Circle {
    private double radius;
    private double area;
    private double circufmence;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }

    public void setArea() {
        this.area = radius * radius * Math.PI;
    }

    public double getCircufmence() {
        return circufmence;
    }

    public void setCircufmence(double circufmence) {
        this.circufmence =  2 * radius * Math.PI;
    }
}
