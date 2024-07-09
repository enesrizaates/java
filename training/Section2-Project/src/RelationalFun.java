package src;

public class RelationalFun {
    public static void main(String[] args) {
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 37;
        int yourAge = 20;
        int bobsAge = 20;

        String myName = "John";
        String yourName = "Johnny";

        System.out.println("My bool is " + myBool);
        System.out.println("Your bool is " + yourBool);
        System.out.println("My age is " + myAge);

        // relational operations
        boolean ageComparison = myAge > yourAge;
        System.out.println("myAge > yourAge ?" + ageComparison);

        ageComparison = yourAge > bobsAge;
        System.out.println("yourAge > bobsAge ?" + ageComparison);

        ageComparison = yourAge == bobsAge;
        System.out.println("yourAge == bobsAge ?" + ageComparison);

        boolean nameComparison = myName.equals(yourName);
        System.out.println("do names match ?" + nameComparison);

        int currentAge = 43;
        boolean isLess = currentAge >= 21;
        System.out.println("current age is greater than or equal 21 is " + isLess);


    }// end main
}