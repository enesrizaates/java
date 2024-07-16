import java.util.Scanner;
import java.util.ArrayList;

public class Proj5_1_NamePermutations {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();
        String name;
        String firstName;
        String lastName;
        int spaceIndex;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a full name: ");
            name = keyboard.nextLine();
            spaceIndex = name.indexOf(" ");
            firstName = name.substring(0, spaceIndex);
            lastName = name.substring(spaceIndex + 1);
            firstNames.add(firstName);
            lastNames.add(lastName);
        }
        for (int i =0; i < firstNames.size(); i++) {
            for (int j = 0; j < lastNames.size(); j++) {
                System.out.println(firstNames.get(i) + " " + lastNames.get(j));
            }
        }

    }
}
