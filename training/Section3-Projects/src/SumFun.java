import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input;
        int sum = 0;

        System.out.println("Enter an positive integer: ");
        System.out.println("Or a negative to exit");
        input = keyboard.nextInt();

        while (input >= 0) {
            sum += input;
            System.out.println("The sum is: " + sum);

            System.out.println("Enter an positive integer: ");
            System.out.println("Or a negative to exit");
            input = keyboard.nextInt();
        }
        System.out.println("The sum is: " + sum);
        
    }
}
