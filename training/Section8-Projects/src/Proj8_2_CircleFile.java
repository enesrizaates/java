import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Proj8_2_CircleFile {
    public static void main(String[] args) {
        ArrayList<Circle> circles;
        circles = new ArrayList<>();

        fillArrayList(circles);
        printCircles(circles);
        writeToFile(circles);
    }

    public static void fillArrayList(ArrayList<Circle> circles) {
        try {
            Scanner sc;
            sc = new Scanner(new File("circle_data.txt"));
            double radius;
            Circle temp;

            while (sc.hasNextLine()) {
                radius = sc.nextDouble();
                temp = new Circle(radius);
                circles.add(temp);
            }

            sc.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }

    public static void printCircles(ArrayList<Circle> circles) {
        for (Circle circle : circles) {
            System.out.println("radius :" + circle.getRadius());
            System.out.println("area :" + circle.area());
            System.out.println("perimeter :" + circle.perimeter());
            System.out.println();
        }
    }

    public static void writeToFile(ArrayList<Circle> circles) {
        PrintWriter output;

        try {
            output = new PrintWriter("circles_output.txt");

            for (Circle circle : circles) {
                System.out.println("radius :" + circle.getRadius());
                System.out.println("area :" + circle.area());
                System.out.println("perimeter :" + circle.perimeter());
                System.out.println();
            }
            output.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }

}
