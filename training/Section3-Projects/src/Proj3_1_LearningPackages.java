import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int packageNumber;
        int howManyCourses;
        int baseCost = 0;
        int costPerCost = 0;
        int numIncluded = 0;
        int totalCost = 0;

        System.out.print("Which of the packages do you want? 1,2 or 3: ");
        packageNumber = keyboard.nextInt();

        System.out.print("How many courses do you want? ");
        howManyCourses = keyboard.nextInt();

        if (packageNumber == 1) {
            numIncluded = 2;
            baseCost = 10;
            costPerCost = 6;
        }
        else if (packageNumber == 2) {
            numIncluded = 4;
            baseCost = 12;
            costPerCost = 4;
        }
        else if (packageNumber == 3) {
            numIncluded = 6;
            baseCost = 15;
            costPerCost = 3;
        }

        if (numIncluded < howManyCourses) {
            totalCost = baseCost + (howManyCourses - numIncluded) * costPerCost;
        }
        else {
            totalCost = baseCost;
        }

        System.out.println("Total cost: " + totalCost);
    }
}
