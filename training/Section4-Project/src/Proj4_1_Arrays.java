import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] inputArray = new int[5];

        for (int i = 0; i < inputArray.length; i++) {
            System.out.print("Enter an integer: ");
            inputArray[i] = keyboard.nextInt();
        };

        for (int i = 0; i < inputArray.length; i++) {
            System.out.println("result is" + inputArray[i] * 2);
        }
    }
}
