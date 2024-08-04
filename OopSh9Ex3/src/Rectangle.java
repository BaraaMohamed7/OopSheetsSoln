public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this(1,1);
    }

    public Rectangle(double width, double height) {

        if (width <= 0 ||  height <= 0) {
            throw new InvalidRectangleException();
        }
            this.width = width;
            this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}
