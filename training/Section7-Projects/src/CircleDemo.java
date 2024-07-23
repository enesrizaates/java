public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(9);
        printCircle(circle1);
        printCircle(circle2);
    }

    public static void printCircle(Circle circle) {
        System.out.println("r: " + circle.getRadius());
        System.out.println("C: " + String.format("%.2f", circle.cicumference()));
        System.out.println("A: " + String.format("%.2f", circle.area()));
        System.out.println();
    }

}
