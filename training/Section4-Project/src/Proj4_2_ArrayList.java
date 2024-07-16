import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        int number =0;

        while (number >= 0) {
            System.out.println("Enter an integer");
            number = keyboard.nextInt();
            myList.add(number);
        }

//        for (int i=myList.size(); i >= 0; i--) {
//            System.out.println(myList.get(i));
//        }
        number = myList.size();
        while (number > 0) {
            System.out.println(myList.get(number - 1));
            number -= 1;
        }
    }
}
