import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        char gender;

        System.out.print("Enter your age: \t");
        age = keyboard.nextInt();

        System.out.print("Enter your gender: \t");
        gender = keyboard.next().charAt(0);

        if (gender == 'M' && age >= 19) {
            System.out.println("You can join to the fraternity.");
        }
        else {
            System.out.println("Sorry, you can not join to the fraternity.");
        }
    }
}
