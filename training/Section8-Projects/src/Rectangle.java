public class Rectangle {
    private double length;
    private double width;

    private static int numRectangles;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        numRectangles++;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }
}
