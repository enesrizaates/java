package src;
 import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String city;
        int age;

        System.out.println("What is your name?: ");
        name = keyboard.nextLine();

        System.out.println("What is your age?: ");
        age = keyboard.nextInt();
        keyboard.nextLine(); // consume the new line

        System.out.println("What is your city?: ");
        city= keyboard.nextLine();

        System.out.println("Hello, " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your city is " + city);
    }// end main
}
