package src;
import java.util.Scanner;

public class Proj2_2_MadLibsClone {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String adjective1, girlsName, adjective2, occupation1, place, clothing, hobby, adjective3, occupation2, boysName, mansName;

        System.out.print("Enter adjective 1: \t");
        adjective1 = keyboard.nextLine();
        System.out.print("Enter girl's name:  \t");
        girlsName = keyboard.nextLine();
        System.out.print("Enter adjective2:  \t");
        adjective2= keyboard.nextLine();
        System.out.print("Enter occupation1:  \t");
        occupation1 = keyboard.nextLine();
        System.out.print("Enter place:  \t");
        place = keyboard.nextLine();
        System.out.print("Enter clothing:  \t");
        clothing = keyboard.nextLine();
        System.out.print("Enter hobby:  \t");
        hobby = keyboard.nextLine();
        System.out.print("Enter adjective3:  \t");
        adjective3 = keyboard.nextLine();
        System.out.print("Enter occupation2:  \t");
        occupation2 = keyboard.nextLine();
        System.out.print("Enter boy's name:  \t");
        boysName = keyboard.nextLine();
        System.out.print("Enter man's name:  \t");
        mansName = keyboard.nextLine();

        System.out.println();

        System.out.println("There once a " + adjective1 +" girl named " +  girlsName +" who was a " +  adjective2 +
                " " + occupation1 + " in the Kingdom of " + place + ".");
        System.out.println("She loved to wear " + clothing + " and to " + hobby +
                ". She wanted to marry " +  adjective3 + " " +  occupation2 + " named " + boysName +
                " but her father, King " + mansName + " forbid her from seeing him.");
    }
}
