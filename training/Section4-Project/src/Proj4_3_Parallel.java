import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_3_Parallel {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        int age;
        String name;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a name: \t");
            name = keyboard.nextLine();
            names.add(name);
            System.out.print("Enter age: \t");
            age = keyboard.nextInt();
            ages.add(age);
            // consume new line
            keyboard.nextLine();
            System.out.println();
        }

        // write message for everyone
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " is " + ages.get(i) + " years old.");
        }
    }
}
