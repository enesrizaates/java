public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 10);

        System.out.println(Rectangle.getNumRectangles());

        Rectangle r3;

        System.out.println("After r3 declared: " + Rectangle.getNumRectangles());

        r3 = new Rectangle(2.5, 3);


        System.out.println(r1.area());
        System.out.println(r2.area());

        System.out.println("The perimeter of the rectangle r1: " + r1.perimeter());
        System.out.println("The perimeter of the rectangle r2: " + r2.perimeter());
    }
}
