import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;

        System.out.println("Please enter your integer");
        num = keyboard.nextInt();

        if (num % 3 == 0) {
            System.out.println(num + " is divisible by 3");
        }
        else {
            System.out.println(num + " is NOT divisible by 3");
        }
    }
}
