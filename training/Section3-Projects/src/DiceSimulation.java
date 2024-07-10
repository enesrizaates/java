import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {
        Random rand = new Random();
        int counter = 0;
        int number;
        while (counter < 10) {
            number = rand.nextInt(6) + 1;
            System.out.println(number);
            counter++;
        }
    }
}
