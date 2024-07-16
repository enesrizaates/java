import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String fullName;
        String firstName;
        String lastName;
        int index;

        System.out.print("Enter a name: ");
        fullName = keyboard.nextLine();

        index = fullName.indexOf(" ");
        firstName = fullName.substring(0, index);
        lastName = fullName.substring(index + 1);

        System.out.println("Upper case of first name: " + firstName.toUpperCase());
        System.out.println("Lower case of last name: " + lastName.toLowerCase());

    }
}
